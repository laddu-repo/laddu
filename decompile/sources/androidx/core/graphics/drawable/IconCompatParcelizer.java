package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import q5.a;
import q5.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f859a = aVar.f(iconCompat.f859a, 1);
        byte[] bArr = iconCompat.f861c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f11092e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f861c = bArr;
        iconCompat.f862d = aVar.g(iconCompat.f862d, 3);
        iconCompat.f863e = aVar.f(iconCompat.f863e, 4);
        iconCompat.f864f = aVar.f(iconCompat.f864f, 5);
        iconCompat.f865g = (ColorStateList) aVar.g(iconCompat.f865g, 6);
        String str = iconCompat.f867i;
        if (aVar.e(7)) {
            str = ((b) aVar).f11092e.readString();
        }
        iconCompat.f867i = str;
        String str2 = iconCompat.j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f11092e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f866h = PorterDuff.Mode.valueOf(iconCompat.f867i);
        switch (iconCompat.f859a) {
            case -1:
                Parcelable parcelable = iconCompat.f862d;
                if (parcelable != null) {
                    iconCompat.f860b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f862d;
                if (parcelable2 != null) {
                    iconCompat.f860b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f861c;
                iconCompat.f860b = bArr3;
                iconCompat.f859a = 3;
                iconCompat.f863e = 0;
                iconCompat.f864f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f861c, Charset.forName("UTF-16"));
                iconCompat.f860b = str3;
                if (iconCompat.f859a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f860b = iconCompat.f861c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f867i = iconCompat.f866h.name();
        switch (iconCompat.f859a) {
            case -1:
                iconCompat.f862d = (Parcelable) iconCompat.f860b;
                break;
            case 1:
            case 5:
                iconCompat.f862d = (Parcelable) iconCompat.f860b;
                break;
            case 2:
                iconCompat.f861c = ((String) iconCompat.f860b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f861c = (byte[]) iconCompat.f860b;
                break;
            case 4:
            case 6:
                iconCompat.f861c = iconCompat.f860b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i6 = iconCompat.f859a;
        if (-1 != i6) {
            aVar.j(i6, 1);
        }
        byte[] bArr = iconCompat.f861c;
        if (bArr != null) {
            aVar.i(2);
            Parcel parcel = ((b) aVar).f11092e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f862d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i10 = iconCompat.f863e;
        if (i10 != 0) {
            aVar.j(i10, 4);
        }
        int i11 = iconCompat.f864f;
        if (i11 != 0) {
            aVar.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f865g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f867i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f11092e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f11092e.writeString(str2);
        }
    }
}
