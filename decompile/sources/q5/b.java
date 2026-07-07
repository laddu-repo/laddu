package q5;

import android.os.Parcel;
import android.util.SparseIntArray;
import okhttp3.HttpUrl;
import v.e;
import v.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f11091d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f11092e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11093f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11094g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11095h;

    /* renamed from: i, reason: collision with root package name */
    public int f11096i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f11097k;

    /* JADX WARN: Type inference failed for: r5v0, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r6v0, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r7v0, types: [v.l, v.e] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), HttpUrl.FRAGMENT_ENCODE_SET, new l(0), new l(0), new l(0));
    }

    @Override // q5.a
    public final b a() {
        Parcel parcel = this.f11092e;
        int dataPosition = parcel.dataPosition();
        int i6 = this.j;
        if (i6 == this.f11093f) {
            i6 = this.f11094g;
        }
        return new b(parcel, dataPosition, i6, r4.a.o(new StringBuilder(), this.f11095h, "  "), this.f11088a, this.f11089b, this.f11090c);
    }

    @Override // q5.a
    public final boolean e(int i6) {
        while (this.j < this.f11094g) {
            int i10 = this.f11097k;
            if (i10 != i6) {
                if (String.valueOf(i10).compareTo(String.valueOf(i6)) <= 0) {
                    int i11 = this.j;
                    Parcel parcel = this.f11092e;
                    parcel.setDataPosition(i11);
                    int readInt = parcel.readInt();
                    this.f11097k = parcel.readInt();
                    this.j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f11097k == i6) {
            return true;
        }
        return false;
    }

    @Override // q5.a
    public final void i(int i6) {
        int i10 = this.f11096i;
        SparseIntArray sparseIntArray = this.f11091d;
        Parcel parcel = this.f11092e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f11096i = i6;
        sparseIntArray.put(i6, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i6);
    }

    public b(Parcel parcel, int i6, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f11091d = new SparseIntArray();
        this.f11096i = -1;
        this.f11097k = -1;
        this.f11092e = parcel;
        this.f11093f = i6;
        this.f11094g = i10;
        this.j = i6;
        this.f11095h = str;
    }
}
