package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c implements bf.c, Serializable {
    public static final Object NO_RECEIVER = b.f8046x;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient bf.c reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // bf.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // bf.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public bf.c compute() {
        bf.c cVar = this.reflected;
        if (cVar == null) {
            bf.c computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return cVar;
    }

    public abstract bf.c computeReflected();

    @Override // bf.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public bf.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            x.f8056a.getClass();
            return new o(cls);
        }
        return x.a(cls);
    }

    @Override // bf.c
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract bf.c getReflected();

    @Override // bf.c
    public bf.p getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // bf.c
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // bf.c
    public bf.t getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // bf.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // bf.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // bf.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // bf.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
