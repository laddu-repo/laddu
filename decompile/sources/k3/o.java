package k3;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.Objects;
import t1.b0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f7333c;

    public o(String str, String str2, z0 z0Var) {
        super(str);
        w1.a.d(!z0Var.isEmpty());
        this.f7332b = str2;
        f0 f0VarM = f0.m(z0Var);
        this.f7333c = f0VarM;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // k3.j, t1.d0
    public final void b(b0 b0Var) {
        byte b9;
        String str = this.f7321a;
        switch (str.hashCode()) {
            case 82815:
                b9 = !str.equals("TAL") ? (byte) -1 : (byte) 0;
                break;
            case 82878:
                b9 = !str.equals("TCM") ? (byte) -1 : (byte) 1;
                break;
            case 82897:
                b9 = !str.equals("TDA") ? (byte) -1 : (byte) 2;
                break;
            case 83253:
                b9 = !str.equals("TP1") ? (byte) -1 : (byte) 3;
                break;
            case 83254:
                b9 = !str.equals("TP2") ? (byte) -1 : (byte) 4;
                break;
            case 83255:
                b9 = !str.equals("TP3") ? (byte) -1 : (byte) 5;
                break;
            case 83341:
                b9 = !str.equals("TRK") ? (byte) -1 : (byte) 6;
                break;
            case 83378:
                b9 = !str.equals("TT2") ? (byte) -1 : (byte) 7;
                break;
            case 83536:
                b9 = !str.equals("TXT") ? (byte) -1 : (byte) 8;
                break;
            case 83552:
                b9 = !str.equals("TYE") ? (byte) -1 : (byte) 9;
                break;
            case 2567331:
                b9 = !str.equals("TALB") ? (byte) -1 : (byte) 10;
                break;
            case 2569357:
                b9 = !str.equals("TCOM") ? (byte) -1 : (byte) 11;
                break;
            case 2569358:
                b9 = !str.equals("TCON") ? (byte) -1 : (byte) 12;
                break;
            case 2569891:
                b9 = !str.equals("TDAT") ? (byte) -1 : (byte) 13;
                break;
            case 2570401:
                b9 = !str.equals("TDRC") ? (byte) -1 : (byte) 14;
                break;
            case 2570410:
                b9 = !str.equals("TDRL") ? (byte) -1 : (byte) 15;
                break;
            case 2571565:
                b9 = !str.equals("TEXT") ? (byte) -1 : (byte) 16;
                break;
            case 2575251:
                b9 = !str.equals("TIT2") ? (byte) -1 : (byte) 17;
                break;
            case 2581512:
                b9 = !str.equals("TPE1") ? (byte) -1 : (byte) 18;
                break;
            case 2581513:
                b9 = !str.equals("TPE2") ? (byte) -1 : (byte) 19;
                break;
            case 2581514:
                b9 = !str.equals("TPE3") ? (byte) -1 : (byte) 20;
                break;
            case 2583398:
                b9 = !str.equals("TRCK") ? (byte) -1 : (byte) 21;
                break;
            case 2590194:
                b9 = !str.equals("TYER") ? (byte) -1 : (byte) 22;
                break;
            default:
                b9 = -1;
                break;
        }
        f0 f0Var = this.f7333c;
        try {
            switch (b9) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                case 10:
                    b0Var.f11926c = (CharSequence) f0Var.get(0);
                    break;
                case 1:
                case 11:
                    b0Var.f11940s = (CharSequence) f0Var.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) f0Var.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i10 = Integer.parseInt(str2.substring(0, 2));
                    b0Var.f11934m = Integer.valueOf(i);
                    b0Var.f11935n = Integer.valueOf(i10);
                    break;
                case 3:
                case 18:
                    b0Var.f11925b = (CharSequence) f0Var.get(0);
                    break;
                case g1.g.LONG_FIELD_NUMBER /* 4 */:
                case 19:
                    b0Var.f11927d = (CharSequence) f0Var.get(0);
                    break;
                case g1.g.STRING_FIELD_NUMBER /* 5 */:
                case 20:
                    b0Var.f11941t = (CharSequence) f0Var.get(0);
                    break;
                case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                case 21:
                    String str3 = (String) f0Var.get(0);
                    int i11 = w1.b0.f13686a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    b0Var.f11930h = Integer.valueOf(i12);
                    b0Var.i = numValueOf;
                    break;
                case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                case 17:
                    b0Var.f11924a = (CharSequence) f0Var.get(0);
                    break;
                case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                case 16:
                    b0Var.f11939r = (CharSequence) f0Var.get(0);
                    break;
                case 9:
                case 22:
                    b0Var.f11933l = Integer.valueOf(Integer.parseInt((String) f0Var.get(0)));
                    break;
                case 12:
                    Integer numO = z7.b.O((String) f0Var.get(0));
                    if (numO != null) {
                        String strA = k.a(numO.intValue());
                        if (strA != null) {
                            b0Var.f11944w = strA;
                        }
                    } else {
                        b0Var.f11944w = (CharSequence) f0Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) f0Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                b0Var.f11935n = (Integer) arrayListD.get(2);
                            }
                        }
                        b0Var.f11934m = (Integer) arrayListD.get(1);
                    }
                    b0Var.f11933l = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) f0Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                b0Var.f11938q = (Integer) arrayListD2.get(2);
                            }
                        }
                        b0Var.f11937p = (Integer) arrayListD2.get(1);
                    }
                    b0Var.f11936o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f7321a, oVar.f7321a) && Objects.equals(this.f7332b, oVar.f7332b) && this.f7333c.equals(oVar.f7333c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = d0.d.e(527, 31, this.f7321a);
        String str = this.f7332b;
        return this.f7333c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // k3.j
    public final String toString() {
        return this.f7321a + ": description=" + this.f7332b + ": values=" + this.f7333c;
    }
}
