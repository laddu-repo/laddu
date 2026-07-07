package ac;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f463a = new u(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f464b = new u(2);

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        de.i.e(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = pd.p.f10551v;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(pd.l.C(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            String str2 = runningAppProcessInfo.processName;
            de.i.d(str2, "processName");
            arrayList3.add(new i0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, de.i.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public static i0 b(Context context) {
        Object obj;
        String strB;
        de.i.e(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListA = a(context);
        int size = arrayListA.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListA.get(i);
            i++;
            if (((i0) obj).f404b == iMyPid) {
                break;
            }
        }
        i0 i0Var = (i0) obj;
        if (i0Var != null) {
            return i0Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            strB = Process.myProcessName();
            de.i.d(strB, "myProcessName(...)");
        } else if ((i10 < 28 || (strB = Application.getProcessName()) == null) && (strB = x7.b.b()) == null) {
            strB = "";
        }
        return new i0(strB, iMyPid, 0, false);
    }
}
