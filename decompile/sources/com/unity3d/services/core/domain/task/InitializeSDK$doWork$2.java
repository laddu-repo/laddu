package com.unity3d.services.core.domain.task;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeSDK$doWork$2 extends j implements p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, c cVar) {
        super(2, cVar);
        this.this$0 = initializeSDK;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, cVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeSDK$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x031c, code lost:
    
        if (r12 == r5) goto L128;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02ef A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a1 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023c A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021c A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0248 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b1 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:7:0x0014, B:8:0x031f, B:17:0x0029, B:18:0x0302, B:22:0x0034, B:23:0x02eb, B:25:0x02ef, B:29:0x0045, B:30:0x02b6, B:31:0x02c7, B:36:0x0050, B:39:0x029d, B:41:0x02a1, B:45:0x005e, B:46:0x0236, B:48:0x023c, B:49:0x0247, B:52:0x0076, B:54:0x0218, B:56:0x021c, B:59:0x0248, B:61:0x0253, B:63:0x025d, B:65:0x0263, B:66:0x0277, B:70:0x02c1, B:72:0x0325, B:73:0x032c, B:75:0x0090, B:76:0x01f6, B:80:0x00a1, B:82:0x01db, B:84:0x01df, B:88:0x00af, B:89:0x01ab, B:91:0x01b1, B:92:0x01bc, B:95:0x00c5, B:97:0x0190, B:99:0x0194, B:102:0x01bd, B:107:0x00d9, B:108:0x0150, B:110:0x0156, B:111:0x0169, B:114:0x0173, B:118:0x00e9, B:119:0x0133, B:124:0x00f7, B:126:0x0112), top: B:2:0x0009 }] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
