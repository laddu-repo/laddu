package kotlin.jvm.internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r extends c implements bf.o {
    private final boolean syntheticJavaProperty;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = 1
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = 0
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.syntheticJavaProperty = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.r.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.c
    public bf.c compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (getOwner().equals(rVar.getOwner()) && getName().equals(rVar.getName()) && getSignature().equals(rVar.getSignature()) && k.a(getBoundReceiver(), rVar.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof bf.o)) {
            return false;
        }
        return obj.equals(compute());
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // bf.o
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // bf.o
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        bf.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public bf.o getReflected() {
        if (!this.syntheticJavaProperty) {
            bf.c compute = compute();
            if (compute != this) {
                return (bf.o) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
