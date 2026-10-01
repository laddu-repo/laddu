package q5;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f11088a;

    /* renamed from: b, reason: collision with root package name */
    public final e f11089b;

    /* renamed from: c, reason: collision with root package name */
    public final e f11090c;

    public a(e eVar, e eVar2, e eVar3) {
        this.f11088a = eVar;
        this.f11089b = eVar2;
        this.f11090c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f11090c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            eVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        e eVar = this.f11088a;
        Method method = (Method) eVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            eVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f11089b;
        Method method = (Method) eVar.get(name);
        if (method == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, a.class);
            eVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i6);

    public final int f(int i6, int i10) {
        if (!e(i10)) {
            return i6;
        }
        return ((b) this).f11092e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i6) {
        if (!e(i6)) {
            return parcelable;
        }
        return ((b) this).f11092e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f11092e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void i(int i6);

    public final void j(int i6, int i10) {
        i(i10);
        ((b) this).f11092e.writeInt(i6);
    }

    public final void k(Parcelable parcelable, int i6) {
        i(i6);
        ((b) this).f11092e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).f11092e.writeString(null);
            return;
        }
        try {
            ((b) this).f11092e.writeString(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a10);
                Parcel parcel = a10.f11092e;
                int i6 = a10.f11096i;
                if (i6 >= 0) {
                    int i10 = a10.f11091d.get(i6);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
