package kotlin.jvm.internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i extends c implements h, bf.f {
    private final int arity;
    private final int flags;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 != r0) goto Lc
            r7 = 1
        L6:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            goto Le
        Lc:
            r7 = 0
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.arity = r9
            r2.flags = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.i.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.c
    public bf.c computeReflected() {
        x.f8056a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && k.a(getBoundReceiver(), iVar.getBoundReceiver()) && k.a(getOwner(), iVar.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof bf.f)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // bf.f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // bf.f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // bf.f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // bf.f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.c, bf.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        bf.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public bf.f getReflected() {
        bf.c compute = compute();
        if (compute != this) {
            return (bf.f) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
