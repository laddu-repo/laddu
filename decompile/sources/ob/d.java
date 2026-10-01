package ob;

import a7.s;
import android.content.Context;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.emoji2.text.k;
import de.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k8.g2;
import k8.k4;
import o2.p;
import o8.g;
import o8.h;
import o8.m;
import o8.o;
import org.json.JSONException;
import org.json.JSONObject;
import sa.l;
import t7.y;
import y.e;
import y.f;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class d implements v4.b, pe.c, g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10104v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f10105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f10106x;

    public /* synthetic */ d(int i, Object obj) {
        this.f10104v = i;
        this.f10106x = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ob.d f(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            vf.f[] r0 = new vf.f[r0]     // Catch: java.io.IOException -> L6d
            vf.c r1 = new vf.c     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = u5.b.f12889z     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.p0(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.u0(r9, r8, r4)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.v0(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.u0(r9, r7, r4)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.p0(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            long r4 = r1.f13603w     // Catch: java.io.IOException -> L6d
            vf.f r4 = r1.q(r4)     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L5b:
            ob.d r1 = new ob.d     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            vf.k r0 = a.a.u(r0)     // Catch: java.io.IOException -> L6d
            r2 = 15
            r1.<init>(r2, r12, r0)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.d.f(java.lang.String[]):ob.d");
    }

    @Override // o8.g
    public o C(Object obj) {
        Boolean bool = (Boolean) obj;
        l lVar = (l) this.f10106x;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            p pVar = lVar.f11630b;
            if (zBooleanValue) {
                ((h) pVar.A).c(null);
                return ((o) this.f10105w).k(lVar.f11633e.f12520a, new g2(17, this));
            }
            pVar.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        ya.c cVar = lVar.f11634g;
        Iterator it = ya.c.e(((File) cVar.f14650x).listFiles(l.f11627r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        ya.c cVar2 = ((ya.a) lVar.f11639m.f2889c).f14644b;
        ya.a.a(ya.c.e(((File) cVar2.f14652z).listFiles()));
        ya.a.a(ya.c.e(((File) cVar2.A).listFiles()));
        ya.a.a(ya.c.e(((File) cVar2.B).listFiles()));
        lVar.f11643q.c(null);
        return b8.h.o(null);
    }

    public void a(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f10105w).add(d0.d.n(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0075, B:33:0x0080, B:32:0x007b, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0075, B:33:0x0080, B:32:0x007b, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    @Override // v4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v4.a b(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.d.b(java.lang.String):v4.a");
    }

    public File c() {
        if (((File) this.f10105w) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f10105w) == null) {
                        String str = "PersistedInstallation." + ((fa.g) this.f10106x).d() + ".json";
                        fa.g gVar = (fa.g) this.f10106x;
                        gVar.a();
                        File file = new File(gVar.f5336a.getNoBackupFilesDir(), str);
                        this.f10105w = file;
                        if (file.exists()) {
                            return (File) this.f10105w;
                        }
                        fa.g gVar2 = (fa.g) this.f10106x;
                        gVar2.a();
                        File file2 = new File(gVar2.f5336a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f10105w)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f10105w;
    }

    public synchronized Map d() {
        try {
            if (((Map) this.f10106x) == null) {
                this.f10106x = Collections.unmodifiableMap(new HashMap((HashMap) this.f10105w));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f10106x;
    }

    public void e(b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f10095a);
            jSONObject.put("Status", e.c(bVar.f10096b));
            jSONObject.put("AuthToken", bVar.f10097c);
            jSONObject.put("RefreshToken", bVar.f10098d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.f10099e);
            jSONObject.put("FisError", bVar.f10100g);
            fa.g gVar = (fa.g) this.f10106x;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f5336a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(c())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // pe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(pe.d r7, ud.c r8) {
        /*
            r6 = this;
            int r0 = r6.f10104v
            switch(r0) {
                case 3: goto L23;
                default: goto L5;
            }
        L5:
            de.n r0 = new de.n
            r0.<init>()
            java.lang.Object r1 = r6.f10105w
            p2.c r1 = (p2.c) r1
            pe.o r2 = new pe.o
            java.lang.Object r3 = r6.f10106x
            d1.p r3 = (d1.p) r3
            r2.<init>(r0, r7, r3)
            java.lang.Object r7 = r1.g(r2, r8)
            td.a r8 = td.a.f12544v
            if (r7 != r8) goto L20
            goto L22
        L20:
            od.l r7 = od.l.f10126a
        L22:
            return r7
        L23:
            boolean r0 = r8 instanceof pe.i
            if (r0 == 0) goto L36
            r0 = r8
            pe.i r0 = (pe.i) r0
            int r1 = r0.f10571z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L36
            int r1 = r1 - r2
            r0.f10571z = r1
            goto L3b
        L36:
            pe.i r0 = new pe.i
            r0.<init>(r6, r8)
        L3b:
            java.lang.Object r8 = r0.f10570y
            int r1 = r0.f10571z
            r2 = 2
            r3 = 1
            td.a r4 = td.a.f12544v
            if (r1 == 0) goto L61
            if (r1 == r3) goto L55
            if (r1 != r2) goto L4d
            fa.b.z(r8)
            goto L9b
        L4d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L55:
            qe.f r7 = r0.D
            pe.d r1 = r0.C
            ob.d r3 = r0.B
            fa.b.z(r8)     // Catch: java.lang.Throwable -> L5f
            goto L84
        L5f:
            r8 = move-exception
            goto La2
        L61:
            fa.b.z(r8)
            qe.f r8 = new qe.f
            sd.h r1 = r0.f12977w
            de.i.b(r1)
            r8.<init>(r7, r1)
            java.lang.Object r1 = r6.f10105w     // Catch: java.lang.Throwable -> L9e
            d1.n r1 = (d1.n) r1     // Catch: java.lang.Throwable -> L9e
            r0.B = r6     // Catch: java.lang.Throwable -> L9e
            r0.C = r7     // Catch: java.lang.Throwable -> L9e
            r0.D = r8     // Catch: java.lang.Throwable -> L9e
            r0.f10571z = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r1.i(r8, r0)     // Catch: java.lang.Throwable -> L9e
            if (r1 != r4) goto L81
            goto L9d
        L81:
            r3 = r6
            r1 = r7
            r7 = r8
        L84:
            r7.p()
            java.lang.Object r7 = r3.f10106x
            pe.c r7 = (pe.c) r7
            r8 = 0
            r0.B = r8
            r0.C = r8
            r0.D = r8
            r0.f10571z = r2
            java.lang.Object r7 = r7.g(r1, r0)
            if (r7 != r4) goto L9b
            goto L9d
        L9b:
            od.l r4 = od.l.f10126a
        L9d:
            return r4
        L9e:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        La2:
            r7.p()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.d.g(pe.d, ud.c):java.lang.Object");
    }

    public void h(q0.g gVar) {
        s sVar = (s) this.f10106x;
        k4 k4Var = (k4) this.f10105w;
        int i = gVar.f10648b;
        if (i != 0) {
            sVar.execute(new k(i, 2, k4Var));
        } else {
            sVar.execute(new m(k4Var, gVar.f10647a, false, 4));
        }
    }

    public void i(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((v.e) this.f10106x)) {
            ((v.e) this.f10106x).put(new v6.k(cls, cls2, cls3), list);
        }
    }

    @Override // v4.b
    public boolean j() {
        return ((v4.b) this.f10105w).j();
    }

    public b k() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(c());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i10 = b.f10094h;
        byte b9 = (byte) (((byte) (0 | 2)) | 1);
        int i11 = e.d(5)[iOptInt];
        if (i11 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b10 = (byte) (((byte) (b9 | 2)) | 1);
        if (b10 == 3 && i11 != 0) {
            return new b(strOptString, i11, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }

    public int l(Context context, r7.c cVar) {
        int iB;
        y.g(context);
        y.g(cVar);
        int iA = cVar.a();
        int iM = m(iA);
        if (iM != -1) {
            return iM;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f10105w;
        synchronized (sparseIntArray) {
            iB = 0;
            int i = 0;
            while (true) {
                try {
                    if (i >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iA && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iB == -1) {
                iB = ((q7.e) this.f10106x).b(context, iA);
            }
            sparseIntArray.put(iA, iB);
        }
        return iB;
    }

    public int m(int i) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f10105w;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i, -1);
        }
        return i10;
    }

    public String toString() {
        switch (this.f10104v) {
            case 12:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f10106x.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f10105w;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 22:
                String string = "[ ";
                if (((f) this.f10105w) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder sbB = e.b(string);
                        sbB.append(((f) this.f10105w).C[i10]);
                        sbB.append(" ");
                        string = sbB.toString();
                    }
                }
                return string + "] " + ((f) this.f10105w);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f10104v = i;
        this.f10105w = obj;
        this.f10106x = obj2;
    }

    public /* synthetic */ d(int i, boolean z2) {
        this.f10104v = i;
    }

    public /* synthetic */ d(Object obj, Object obj2, boolean z2, int i) {
        this.f10104v = i;
        this.f10105w = obj2;
        this.f10106x = obj;
    }

    public d(IBinder iBinder) throws RemoteException {
        this.f10104v = 2;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f10105w = new Messenger(iBinder);
            this.f10106x = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f10106x = new p7.g(iBinder);
            this.f10105w = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ d(Object obj) {
        this.f10104v = 12;
        this.f10106x = obj;
        this.f10105w = new ArrayList();
    }

    public d(int i) {
        this.f10104v = i;
        switch (i) {
            case 11:
                this.f10105w = new AtomicInteger();
                this.f10106x = new AtomicInteger();
                break;
            case 13:
                q7.e eVar = q7.e.f10906e;
                this.f10105w = new SparseIntArray();
                this.f10106x = eVar;
                break;
            case 23:
                this.f10105w = new HashMap();
                break;
            default:
                this.f10105w = new AtomicReference();
                this.f10106x = new v.e(0);
                break;
        }
    }

    public d(mb.b bVar) {
        this.f10104v = 19;
        this.f10106x = Collections.synchronizedMap(new HashMap());
        this.f10105w = bVar;
    }

    public d(b0.e eVar, v4.b bVar) {
        this.f10104v = 1;
        i.e(bVar, "actual");
        this.f10106x = eVar;
        this.f10105w = bVar;
    }

    public d(z0 z0Var, int[] iArr) {
        this.f10104v = 20;
        this.f10105w = f0.m(z0Var);
        this.f10106x = iArr;
    }
}
