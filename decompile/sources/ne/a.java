package ne;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a implements le.c, d, Serializable {
    private final le.c completion;

    public a(le.c cVar) {
        this.completion = cVar;
    }

    public le.c create(le.c completion) {
        k.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        le.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final le.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i6;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i10;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        int i11 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            i6 = i10 - 1;
        } catch (Exception unused) {
            i6 = -1;
        }
        if (i6 >= 0) {
            i11 = eVar.l()[i6];
        }
        f fVar = g.f9734b;
        f fVar2 = g.f9733a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(MediationMetaData.KEY_NAME, null));
                g.f9734b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f9734b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.f9730a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.f9731b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = fVar.f9732c;
            if (method3 != null) {
                obj = method3.invoke(invoke2, null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // le.c
    public final void resumeWith(Object obj) {
        le.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            le.c cVar2 = aVar.completion;
            k.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == me.a.f8833x) {
                    return;
                }
            } catch (Throwable th) {
                obj = he.a.b(th);
            }
            aVar.releaseIntercepted();
            if (cVar2 instanceof a) {
                cVar = cVar2;
            } else {
                cVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public le.c create(Object obj, le.c completion) {
        k.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
