package i7;

import b7.y;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6684a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6685b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6686c;

    public m(String str, List list, boolean z10) {
        this.f6684a = str;
        this.f6685b = list;
        this.f6686c = z10;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        return new d7.e(yVar, aVar, this, jVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f6684a + "' Shapes: " + Arrays.toString(this.f6685b.toArray()) + '}';
    }
}
