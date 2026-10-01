package h0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements Handler.Callback, ServiceConnection {

    /* renamed from: x, reason: collision with root package name */
    public final Context f5814x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f5815y;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f5816z = new HashMap();
    public HashSet A = new HashSet();

    public z(Context context) {
        this.f5814x = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f5815y = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(y yVar) {
        boolean z10;
        ArrayDeque arrayDeque = yVar.f5812d;
        ComponentName componentName = yVar.f5809a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (yVar.f5810b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f5814x;
                boolean bindService = context.bindService(component, this, 33);
                yVar.f5810b = bindService;
                if (bindService) {
                    yVar.f5813e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = yVar.f5810b;
            }
            if (z10 && yVar.f5811c != null) {
                while (true) {
                    w wVar = (w) arrayDeque.peek();
                    if (wVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + wVar);
                        }
                        wVar.a(yVar.f5811c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(yVar);
                    return;
                }
                return;
            }
            b(yVar);
        }
    }

    public final void b(y yVar) {
        ComponentName componentName = yVar.f5809a;
        ArrayDeque arrayDeque = yVar.f5812d;
        Handler handler = this.f5815y;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i6 = yVar.f5813e;
        int i10 = i6 + 1;
        yVar.f5813e = i10;
        if (i10 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + yVar.f5813e + " retries");
            arrayDeque.clear();
            return;
        }
        int i11 = (1 << i6) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [b.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i6 = message.what;
        b.c cVar = null;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        return false;
                    }
                    y yVar = (y) this.f5816z.get((ComponentName) message.obj);
                    if (yVar != null) {
                        a(yVar);
                        return true;
                    }
                } else {
                    y yVar2 = (y) this.f5816z.get((ComponentName) message.obj);
                    if (yVar2 != null) {
                        if (yVar2.f5810b) {
                            this.f5814x.unbindService(this);
                            yVar2.f5810b = false;
                        }
                        yVar2.f5811c = null;
                        return true;
                    }
                }
            } else {
                x xVar = (x) message.obj;
                ComponentName componentName = xVar.f5807a;
                IBinder iBinder = xVar.f5808b;
                y yVar3 = (y) this.f5816z.get(componentName);
                if (yVar3 != null) {
                    int i10 = b.b.f1214e;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f1215a);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.c)) {
                            cVar = (b.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f1213e = iBinder;
                            cVar = obj;
                        }
                    }
                    yVar3.f5811c = cVar;
                    yVar3.f5813e = 0;
                    a(yVar3);
                    return true;
                }
            }
        } else {
            w wVar = (w) message.obj;
            String string = Settings.Secure.getString(this.f5814x.getContentResolver(), "enabled_notification_listeners");
            synchronized (a0.f5756b) {
                if (string != null) {
                    try {
                        if (!string.equals(a0.f5757c)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            a0.f5758d = hashSet2;
                            a0.f5757c = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = a0.f5758d;
            }
            if (!hashSet.equals(this.A)) {
                this.A = hashSet;
                List<ResolveInfo> queryIntentServices = this.f5814x.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f5816z.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f5816z.put(componentName3, new y(componentName3));
                    }
                }
                Iterator it2 = this.f5816z.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        y yVar4 = (y) entry.getValue();
                        if (yVar4.f5810b) {
                            this.f5814x.unbindService(this);
                            yVar4.f5810b = false;
                        }
                        yVar4.f5811c = null;
                        it2.remove();
                    }
                }
            }
            for (y yVar5 : this.f5816z.values()) {
                yVar5.f5812d.add(wVar);
                a(yVar5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f5815y.obtainMessage(1, new x(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f5815y.obtainMessage(2, componentName).sendToTarget();
    }
}
