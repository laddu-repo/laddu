package yf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {
    public static final x A;
    public static final x B;
    public static final x C;
    public static final /* synthetic */ x[] D;
    public static final /* synthetic */ oe.b E;

    /* renamed from: z, reason: collision with root package name */
    public static final x f15107z;

    /* renamed from: x, reason: collision with root package name */
    public final char f15108x;

    /* renamed from: y, reason: collision with root package name */
    public final char f15109y;

    static {
        x xVar = new x("OBJ", 0, '{', '}');
        f15107z = xVar;
        x xVar2 = new x("LIST", 1, '[', ']');
        A = xVar2;
        x xVar3 = new x("MAP", 2, '{', '}');
        B = xVar3;
        x xVar4 = new x("POLY_OBJ", 3, '[', ']');
        C = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        D = xVarArr;
        E = new oe.b(xVarArr);
    }

    public x(String str, int i6, char c10, char c11) {
        this.f15108x = c10;
        this.f15109y = c11;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) D.clone();
    }
}
