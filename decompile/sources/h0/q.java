package h0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.playfy.tv.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5786a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f5790e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f5791f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f5792g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f5793h;

    /* renamed from: i, reason: collision with root package name */
    public int f5794i;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public e3.e f5796l;

    /* renamed from: n, reason: collision with root package name */
    public String f5798n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f5799o;

    /* renamed from: r, reason: collision with root package name */
    public String f5802r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final Notification f5803t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5804u;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5787b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5788c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5789d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f5795k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5797m = false;

    /* renamed from: p, reason: collision with root package name */
    public int f5800p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f5801q = 0;

    public q(Context context, String str) {
        Notification notification = new Notification();
        this.f5803t = notification;
        this.f5786a = context;
        this.f5802r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.f5804u = new ArrayList();
        this.s = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [c6.h, java.lang.Object] */
    public final Notification a() {
        boolean z10;
        boolean z11;
        boolean z12;
        Icon g10;
        Notification build;
        Bundle bundle;
        int i6;
        Bundle bundle2;
        int i10;
        ArrayList arrayList;
        int i11;
        Notification.Action.Builder builder;
        Bundle bundle3;
        Icon icon;
        int i12;
        Bitmap c10;
        ?? obj = new Object();
        new ArrayList();
        obj.A = new Bundle();
        obj.f1983z = this;
        Context context = this.f5786a;
        obj.f1981x = context;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            obj.f1982y = s.a(context, this.f5802r);
        } else {
            obj.f1982y = new Notification.Builder(context);
        }
        Notification.Builder builder2 = (Notification.Builder) obj.f1982y;
        Notification notification = this.f5803t;
        Notification.Builder lights = builder2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z13 = true;
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(this.f5790e).setContentText(this.f5791f).setContentInfo(null).setContentIntent(this.f5792g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(null, z13).setNumber(this.f5794i).setProgress(0, 0, false);
        int i14 = 23;
        if (i13 < 23) {
            Notification.Builder builder3 = (Notification.Builder) obj.f1982y;
            IconCompat iconCompat = this.f5793h;
            if (iconCompat == null) {
                c10 = null;
            } else {
                c10 = iconCompat.c();
            }
            builder3.setLargeIcon(c10);
        } else {
            Notification.Builder builder4 = (Notification.Builder) obj.f1982y;
            IconCompat iconCompat2 = this.f5793h;
            if (iconCompat2 == null) {
                g10 = null;
            } else {
                g10 = iconCompat2.g(context);
            }
            a.f(builder4, g10);
        }
        ((Notification.Builder) obj.f1982y).setSubText(null).setUsesChronometer(false).setPriority(this.j);
        ArrayList arrayList2 = this.f5787b;
        int size = arrayList2.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj2 = arrayList2.get(i15);
            i15++;
            k kVar = (k) obj2;
            int i16 = Build.VERSION.SDK_INT;
            if (kVar.f5778b == null && (i12 = kVar.f5781e) != 0) {
                kVar.f5778b = IconCompat.b(i12);
            }
            IconCompat iconCompat3 = kVar.f5778b;
            boolean z14 = kVar.f5779c;
            Bundle bundle4 = kVar.f5777a;
            PendingIntent pendingIntent = kVar.f5783g;
            CharSequence charSequence = kVar.f5782f;
            if (i16 >= i14) {
                if (iconCompat3 != null) {
                    icon = iconCompat3.g(null);
                } else {
                    icon = null;
                }
                builder = a.a(icon, charSequence, pendingIntent);
            } else {
                if (iconCompat3 != null) {
                    i11 = iconCompat3.d();
                } else {
                    i11 = 0;
                }
                builder = new Notification.Action.Builder(i11, charSequence, pendingIntent);
            }
            if (bundle4 != null) {
                bundle3 = new Bundle(bundle4);
            } else {
                bundle3 = new Bundle();
            }
            bundle3.putBoolean("android.support.allowGeneratedReplies", z14);
            if (i16 >= 24) {
                r.b(builder, z14);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i16 >= 28) {
                t.a(builder);
            }
            if (i16 >= 29) {
                g.e(builder);
            }
            if (i16 >= 31) {
                u.a(builder);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", kVar.f5780d);
            builder.addExtras(bundle3);
            ((Notification.Builder) obj.f1982y).addAction(builder.build());
            i14 = 23;
        }
        Bundle bundle5 = this.f5799o;
        if (bundle5 != null) {
            ((Bundle) obj.A).putAll(bundle5);
        }
        int i17 = Build.VERSION.SDK_INT;
        ((Notification.Builder) obj.f1982y).setShowWhen(this.f5795k);
        ((Notification.Builder) obj.f1982y).setLocalOnly(this.f5797m);
        ((Notification.Builder) obj.f1982y).setGroup(null);
        ((Notification.Builder) obj.f1982y).setSortKey(null);
        ((Notification.Builder) obj.f1982y).setGroupSummary(false);
        ((Notification.Builder) obj.f1982y).setCategory(this.f5798n);
        ((Notification.Builder) obj.f1982y).setColor(this.f5800p);
        ((Notification.Builder) obj.f1982y).setVisibility(this.f5801q);
        ((Notification.Builder) obj.f1982y).setPublicVersion(null);
        ((Notification.Builder) obj.f1982y).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.f5804u;
        ArrayList arrayList4 = this.f5788c;
        if (i17 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw r4.a.i(it);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    v.f fVar = new v.f(arrayList3.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj3 = arrayList3.get(i18);
                i18++;
                ((Notification.Builder) obj.f1982y).addPerson((String) obj3);
            }
        }
        ArrayList arrayList5 = this.f5789d;
        if (arrayList5.size() > 0) {
            if (this.f5799o == null) {
                this.f5799o = new Bundle();
            }
            Bundle bundle6 = this.f5799o.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                String num = Integer.toString(i19);
                k kVar2 = (k) arrayList5.get(i19);
                Bundle bundle9 = new Bundle();
                if (kVar2.f5778b == null && (i10 = kVar2.f5781e) != 0) {
                    kVar2.f5778b = IconCompat.b(i10);
                }
                IconCompat iconCompat4 = kVar2.f5778b;
                Bundle bundle10 = kVar2.f5777a;
                if (iconCompat4 != null) {
                    i6 = iconCompat4.d();
                } else {
                    i6 = 0;
                }
                bundle9.putInt("icon", i6);
                bundle9.putCharSequence("title", kVar2.f5782f);
                bundle9.putParcelable("actionIntent", kVar2.f5783g);
                if (bundle10 != null) {
                    bundle2 = new Bundle(bundle10);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", kVar2.f5779c);
                bundle9.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", kVar2.f5780d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (this.f5799o == null) {
                this.f5799o = new Bundle();
            }
            this.f5799o.putBundle("android.car.EXTENSIONS", bundle6);
            ((Bundle) obj.A).putBundle("android.car.EXTENSIONS", bundle7);
        }
        int i20 = Build.VERSION.SDK_INT;
        if (i20 >= 24) {
            ((Notification.Builder) obj.f1982y).setExtras(this.f5799o);
            r.c((Notification.Builder) obj.f1982y);
        }
        if (i20 >= 26) {
            s.b((Notification.Builder) obj.f1982y);
            s.d((Notification.Builder) obj.f1982y);
            s.e((Notification.Builder) obj.f1982y);
            s.f((Notification.Builder) obj.f1982y);
            s.c((Notification.Builder) obj.f1982y);
            if (!TextUtils.isEmpty(this.f5802r)) {
                ((Notification.Builder) obj.f1982y).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i20 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                throw r4.a.i(it2);
            }
        }
        if (i20 >= 29) {
            g.c((Notification.Builder) obj.f1982y, this.s);
            g.d((Notification.Builder) obj.f1982y);
        }
        if (i20 >= 36) {
            v.a((Notification.Builder) obj.f1982y);
        }
        q qVar = (q) obj.f1983z;
        e3.e eVar = qVar.f5796l;
        if (eVar != 0) {
            eVar.U0(obj);
        }
        Notification.Builder builder5 = (Notification.Builder) obj.f1982y;
        int i21 = Build.VERSION.SDK_INT;
        if (i21 >= 26) {
            build = builder5.build();
        } else if (i21 >= 24) {
            build = builder5.build();
        } else {
            builder5.setExtras((Bundle) obj.A);
            build = builder5.build();
        }
        if (eVar != 0) {
            qVar.f5796l.getClass();
        }
        if (eVar != 0 && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", eVar.V0());
        }
        return build;
    }

    public final void c(boolean z10) {
        Notification notification = this.f5803t;
        if (z10) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f5786a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f858k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f860b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f5793h = iconCompat;
    }

    public final void e(e3.e eVar) {
        if (this.f5796l != eVar) {
            this.f5796l = eVar;
            if (((q) eVar.f4301y) != this) {
                eVar.f4301y = this;
                e(eVar);
            }
        }
    }
}
