package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f9389a;

    /* renamed from: b, reason: collision with root package name */
    public long f9390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f9391c;

    public m(o oVar, String str) {
        this.f9391c = oVar;
        w8.x.d(str);
        this.f9389a = str;
        this.f9390b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a() {
        /*
            r21 = this;
            r1 = r21
            n9.o r2 = r1.f9391c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            long r4 = r1.f9390b
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.f9389a
            java.lang.String[] r9 = new java.lang.String[]{r4, r0}
            java.lang.String r8 = "app_id = ? and rowid > ?"
            java.lang.String r13 = "1000"
            r14 = 0
            android.database.sqlite.SQLiteDatabase r5 = r2.U1()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            java.lang.String r6 = "raw_events"
            java.lang.String r15 = "rowid"
            java.lang.String r16 = "name"
            java.lang.String r17 = "timestamp"
            java.lang.String r18 = "metadata_fingerprint"
            java.lang.String r19 = "data"
            java.lang.String r20 = "realtime"
            java.lang.String[] r7 = new java.lang.String[]{r15, r16, r17, r18, r19, r20}     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            java.lang.String r12 = "rowid"
            r10 = 0
            r11 = 0
            android.database.Cursor r14 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            boolean r0 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            if (r0 == 0) goto Lbf
        L3e:
            r0 = 0
            long r6 = r14.getLong(r0)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5 = 3
            long r8 = r14.getLong(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5 = 5
            long r10 = r14.getLong(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r12 = 1
            r5 = 1
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 != 0) goto L56
            r10 = 1
            goto L57
        L56:
            r10 = 0
        L57:
            r0 = 4
            byte[] r0 = r14.getBlob(r0)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            long r11 = r1.f9390b     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 <= 0) goto L64
            r1.f9390b = r6     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
        L64:
            com.google.android.gms.internal.measurement.b3 r11 = com.google.android.gms.internal.measurement.c3.z()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1 java.io.IOException -> La3
            com.google.android.gms.internal.measurement.l5 r0 = n9.y0.Q1(r11, r0)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1 java.io.IOException -> La3
            com.google.android.gms.internal.measurement.b3 r0 = (com.google.android.gms.internal.measurement.b3) r0     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1 java.io.IOException -> La3
            java.lang.String r5 = r14.getString(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            if (r5 != 0) goto L76
            java.lang.String r5 = ""
        L76:
            r0.b()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.m5 r11 = r0.f2337y     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.c3 r11 = (com.google.android.gms.internal.measurement.c3) r11     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r11.F(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5 = 2
            long r11 = r14.getLong(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r0.b()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.m5 r5 = r0.f2337y     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.c3 r5 = (com.google.android.gms.internal.measurement.c3) r5     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5.G(r11)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            n9.l r5 = new n9.l     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            com.google.android.gms.internal.measurement.m5 r0 = r0.e()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r11 = r0
            com.google.android.gms.internal.measurement.c3 r11 = (com.google.android.gms.internal.measurement.c3) r11     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5.<init>(r6, r8, r10, r11)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r3.add(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            goto Lb8
        L9f:
            r0 = move-exception
            goto Ldc
        La1:
            r0 = move-exception
            goto Lc2
        La3:
            r0 = move-exception
            java.lang.Object r5 = r2.f4301y     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            n9.n1 r5 = (n9.n1) r5     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            n9.u0 r5 = r5.C     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            n9.n1.g(r5)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            n9.s0 r5 = r5.D     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            n9.t0 r7 = n9.u0.l1(r4)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r5.c(r7, r0, r6)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
        Lb8:
            boolean r0 = r14.moveToNext()     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            if (r0 != 0) goto L3e
            goto Ld6
        Lbf:
            java.util.List r3 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            goto Ld6
        Lc2:
            java.lang.Object r2 = r2.f4301y     // Catch: java.lang.Throwable -> L9f
            n9.n1 r2 = (n9.n1) r2     // Catch: java.lang.Throwable -> L9f
            n9.u0 r2 = r2.C     // Catch: java.lang.Throwable -> L9f
            n9.n1.g(r2)     // Catch: java.lang.Throwable -> L9f
            n9.s0 r2 = r2.D     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = "Data loss. Error querying raw events batch. appId"
            n9.t0 r4 = n9.u0.l1(r4)     // Catch: java.lang.Throwable -> L9f
            r2.c(r4, r0, r5)     // Catch: java.lang.Throwable -> L9f
        Ld6:
            if (r14 == 0) goto Ldb
            r14.close()
        Ldb:
            return r3
        Ldc:
            if (r14 == 0) goto Le1
            r14.close()
        Le1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.m.a():java.util.List");
    }

    public m(o oVar, String str, long j) {
        this.f9391c = oVar;
        w8.x.d(str);
        this.f9389a = str;
        this.f9390b = oVar.A1("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }
}
