package pe;

import com.google.android.gms.internal.measurement.w0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w0 implements u, c, qe.d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10600z = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10601y;

    public x(Object obj) {
        this._state$volatile = obj;
    }

    public final Object O() {
        re.t tVar = qe.b.f11014b;
        Object obj = f10600z.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    public final boolean P(Object obj, Object obj2) {
        int i;
        z[] zVarArr;
        re.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10600z;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !de.i.a(obj3, obj)) {
                return false;
            }
            if (de.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f10601y;
            if ((i10 & 1) != 0) {
                this.f10601y = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f10601y = i11;
            z[] zVarArr2 = (z[]) this.f3186x;
            while (true) {
                z[] zVarArr3 = zVarArr2;
                if (zVarArr3 != null) {
                    for (z zVar : zVarArr3) {
                        if (zVar != null) {
                            AtomicReference atomicReference = zVar.f10604a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (tVar = y.f10603b)) {
                                    re.t tVar2 = y.f10602a;
                                    if (obj4 != tVar2) {
                                        while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((me.h) obj4).g(od.l.f10126a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, tVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f10601y;
                    if (i == i11) {
                        this.f10601y = i11 + 1;
                        return true;
                    }
                    zVarArr = (z[]) this.f3186x;
                }
                zVarArr2 = zVarArr;
                i11 = i;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final z a() {
        return new z();
    }

    @Override // com.google.android.gms.internal.measurement.w0
    public final z[] b() {
        return new z[2];
    }

    /* JADX WARN: Path cross not found for [B:82:0x014c, B:83:0x014d], limit reached: 97 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0037, B:52:0x00d1, B:54:0x00d9, B:57:0x00e0, B:58:0x00e6, B:60:0x00e9, B:70:0x010a, B:73:0x011a, B:74:0x0136, B:80:0x0146, B:77:0x013d, B:79:0x0143, B:62:0x00ef, B:66:0x00f6, B:21:0x0052, B:24:0x005d, B:51:0x00c1), top: B:91:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0037, B:52:0x00d1, B:54:0x00d9, B:57:0x00e0, B:58:0x00e6, B:60:0x00e9, B:70:0x010a, B:73:0x011a, B:74:0x0136, B:80:0x0146, B:77:0x013d, B:79:0x0143, B:62:0x00ef, B:66:0x00f6, B:21:0x0052, B:24:0x005d, B:51:0x00c1), top: B:91:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0037, B:52:0x00d1, B:54:0x00d9, B:57:0x00e0, B:58:0x00e6, B:60:0x00e9, B:70:0x010a, B:73:0x011a, B:74:0x0136, B:80:0x0146, B:77:0x013d, B:79:0x0143, B:62:0x00ef, B:66:0x00f6, B:21:0x0052, B:24:0x005d, B:51:0x00c1), top: B:91:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0119 -> B:52:0x00d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // pe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(pe.d r18, ud.c r19) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.x.g(pe.d, ud.c):java.lang.Object");
    }

    @Override // pe.d
    public final Object j(Object obj, sd.c cVar) {
        if (obj == null) {
            obj = qe.b.f11014b;
        }
        P(null, obj);
        return od.l.f10126a;
    }

    @Override // qe.d
    public final c y(sd.h hVar, int i, oe.a aVar) {
        return ((((i < 0 || i >= 2) && i != -2) || aVar != oe.a.f10128w) && !((i == 0 || i == -3) && aVar == oe.a.f10127v)) ? new b(this, hVar, i, aVar, 1) : this;
    }
}
