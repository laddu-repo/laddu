package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3637d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f3638e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f3639f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3640a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3641b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3642c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3638e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f3639f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) {
        int i6;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            Object obj = null;
            try {
                i6 = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i6 = 0;
            }
            if (i6 == 0) {
                i6 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i6 == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (r4.a.w(trim)) {
                    HashMap hashMap = constraintLayout.J;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.J.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i6 = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = i6;
            i10++;
            i11++;
        }
        if (i11 != split.length) {
            return Arrays.copyOf(iArr, i11);
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r6v189, types: [d0.i, java.lang.Object] */
    public static j d(Context context, AttributeSet attributeSet, boolean z10) {
        int[] iArr;
        int i6;
        int i10;
        j jVar = new j();
        if (z10) {
            iArr = s.f3646c;
        } else {
            iArr = s.f3644a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        m mVar = jVar.f3567b;
        n nVar = jVar.f3570e;
        l lVar = jVar.f3568c;
        k kVar = jVar.f3569d;
        int[] iArr2 = f3637d;
        String[] strArr = z.a.f15111a;
        SparseIntArray sparseIntArray = f3638e;
        if (z10) {
            ?? obj = new Object();
            obj.f3555a = new int[10];
            obj.f3556b = new int[10];
            obj.f3557c = 0;
            obj.f3558d = new int[10];
            obj.f3559e = new float[10];
            obj.f3560f = 0;
            obj.f3561g = new int[5];
            obj.f3562h = new String[5];
            obj.f3563i = 0;
            obj.j = new int[4];
            obj.f3564k = new boolean[4];
            obj.f3565l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i11 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i11 < indexCount; indexCount = i10) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = i11;
                switch (f3639f.get(index)) {
                    case 2:
                        i10 = indexCount;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, kVar.I));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i10 = indexCount;
                        obj.c(5, obtainStyledAttributes.getString(index));
                        continue;
                    case 6:
                        i10 = indexCount;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.C));
                        break;
                    case 7:
                        i10 = indexCount;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.D));
                        break;
                    case 8:
                        i10 = indexCount;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, kVar.J));
                        break;
                    case 11:
                        i10 = indexCount;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, kVar.P));
                        break;
                    case 12:
                        i10 = indexCount;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, kVar.Q));
                        break;
                    case 13:
                        i10 = indexCount;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, kVar.M));
                        break;
                    case 14:
                        i10 = indexCount;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, kVar.O));
                        break;
                    case 15:
                        i10 = indexCount;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, kVar.R));
                        break;
                    case 16:
                        i10 = indexCount;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, kVar.N));
                        break;
                    case 17:
                        i10 = indexCount;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f3579d));
                        break;
                    case 18:
                        i10 = indexCount;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f3581e));
                        break;
                    case 19:
                        i10 = indexCount;
                        obj.a(19, obtainStyledAttributes.getFloat(index, kVar.f3583f));
                        break;
                    case 20:
                        i10 = indexCount;
                        obj.a(20, obtainStyledAttributes.getFloat(index, kVar.f3607w));
                        break;
                    case 21:
                        i10 = indexCount;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, kVar.f3577c));
                        break;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                        i10 = indexCount;
                        obj.b(22, iArr2[obtainStyledAttributes.getInt(index, mVar.f3620a)]);
                        break;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                        i10 = indexCount;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, kVar.f3575b));
                        break;
                    case 24:
                        i10 = indexCount;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, kVar.F));
                        break;
                    case 27:
                        i10 = indexCount;
                        obj.b(27, obtainStyledAttributes.getInt(index, kVar.E));
                        break;
                    case 28:
                        i10 = indexCount;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, kVar.G));
                        break;
                    case 31:
                        i10 = indexCount;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, kVar.K));
                        break;
                    case 34:
                        i10 = indexCount;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, kVar.H));
                        break;
                    case 37:
                        i10 = indexCount;
                        obj.a(37, obtainStyledAttributes.getFloat(index, kVar.f3608x));
                        break;
                    case 38:
                        i10 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, jVar.f3566a);
                        jVar.f3566a = resourceId;
                        obj.b(38, resourceId);
                        break;
                    case 39:
                        i10 = indexCount;
                        obj.a(39, obtainStyledAttributes.getFloat(index, kVar.U));
                        break;
                    case 40:
                        i10 = indexCount;
                        obj.a(40, obtainStyledAttributes.getFloat(index, kVar.T));
                        break;
                    case 41:
                        i10 = indexCount;
                        obj.b(41, obtainStyledAttributes.getInt(index, kVar.V));
                        break;
                    case 42:
                        i10 = indexCount;
                        obj.b(42, obtainStyledAttributes.getInt(index, kVar.W));
                        break;
                    case 43:
                        i10 = indexCount;
                        obj.a(43, obtainStyledAttributes.getFloat(index, mVar.f3622c));
                        break;
                    case 44:
                        i10 = indexCount;
                        obj.d(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, nVar.f3636m));
                        break;
                    case 45:
                        i10 = indexCount;
                        obj.a(45, obtainStyledAttributes.getFloat(index, nVar.f3626b));
                        break;
                    case 46:
                        i10 = indexCount;
                        obj.a(46, obtainStyledAttributes.getFloat(index, nVar.f3627c));
                        break;
                    case 47:
                        i10 = indexCount;
                        obj.a(47, obtainStyledAttributes.getFloat(index, nVar.f3628d));
                        break;
                    case 48:
                        i10 = indexCount;
                        obj.a(48, obtainStyledAttributes.getFloat(index, nVar.f3629e));
                        break;
                    case 49:
                        i10 = indexCount;
                        obj.a(49, obtainStyledAttributes.getDimension(index, nVar.f3630f));
                        break;
                    case 50:
                        i10 = indexCount;
                        obj.a(50, obtainStyledAttributes.getDimension(index, nVar.f3631g));
                        break;
                    case 51:
                        i10 = indexCount;
                        obj.a(51, obtainStyledAttributes.getDimension(index, nVar.f3633i));
                        break;
                    case 52:
                        i10 = indexCount;
                        obj.a(52, obtainStyledAttributes.getDimension(index, nVar.j));
                        break;
                    case 53:
                        i10 = indexCount;
                        obj.a(53, obtainStyledAttributes.getDimension(index, nVar.f3634k));
                        break;
                    case 54:
                        i10 = indexCount;
                        obj.b(54, obtainStyledAttributes.getInt(index, kVar.X));
                        break;
                    case 55:
                        i10 = indexCount;
                        obj.b(55, obtainStyledAttributes.getInt(index, kVar.Y));
                        break;
                    case 56:
                        i10 = indexCount;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, kVar.Z));
                        break;
                    case 57:
                        i10 = indexCount;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3574a0));
                        break;
                    case 58:
                        i10 = indexCount;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3576b0));
                        break;
                    case 59:
                        i10 = indexCount;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3578c0));
                        break;
                    case 60:
                        i10 = indexCount;
                        obj.a(60, obtainStyledAttributes.getFloat(index, nVar.f3625a));
                        break;
                    case 62:
                        i10 = indexCount;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, kVar.A));
                        break;
                    case 63:
                        i10 = indexCount;
                        obj.a(63, obtainStyledAttributes.getFloat(index, kVar.B));
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        i10 = indexCount;
                        obj.b(64, g(obtainStyledAttributes, index, lVar.f3611a));
                        break;
                    case 65:
                        i10 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            obj.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i10 = indexCount;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i10 = indexCount;
                        obj.a(67, obtainStyledAttributes.getFloat(index, lVar.f3615e));
                        break;
                    case 68:
                        i10 = indexCount;
                        obj.a(68, obtainStyledAttributes.getFloat(index, mVar.f3623d));
                        break;
                    case 69:
                        i10 = indexCount;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i10 = indexCount;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i10 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount;
                        obj.b(72, obtainStyledAttributes.getInt(index, kVar.f3584f0));
                        break;
                    case 73:
                        i10 = indexCount;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f3586g0));
                        break;
                    case 74:
                        i10 = indexCount;
                        obj.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i10 = indexCount;
                        obj.d(75, obtainStyledAttributes.getBoolean(index, kVar.f3599n0));
                        break;
                    case 76:
                        i10 = indexCount;
                        obj.b(76, obtainStyledAttributes.getInt(index, lVar.f3613c));
                        break;
                    case 77:
                        i10 = indexCount;
                        obj.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i10 = indexCount;
                        obj.b(78, obtainStyledAttributes.getInt(index, mVar.f3621b));
                        break;
                    case 79:
                        i10 = indexCount;
                        obj.a(79, obtainStyledAttributes.getFloat(index, lVar.f3614d));
                        break;
                    case 80:
                        i10 = indexCount;
                        obj.d(80, obtainStyledAttributes.getBoolean(index, kVar.f3595l0));
                        break;
                    case 81:
                        i10 = indexCount;
                        obj.d(81, obtainStyledAttributes.getBoolean(index, kVar.f3597m0));
                        break;
                    case 82:
                        i10 = indexCount;
                        obj.b(82, obtainStyledAttributes.getInteger(index, lVar.f3612b));
                        break;
                    case 83:
                        i10 = indexCount;
                        obj.b(83, g(obtainStyledAttributes, index, nVar.f3632h));
                        break;
                    case 84:
                        i10 = indexCount;
                        obj.b(84, obtainStyledAttributes.getInteger(index, lVar.f3617g));
                        break;
                    case 85:
                        i10 = indexCount;
                        obj.a(85, obtainStyledAttributes.getFloat(index, lVar.f3616f));
                        break;
                    case 86:
                        i10 = indexCount;
                        int i13 = obtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            lVar.f3619i = resourceId2;
                            obj.b(89, resourceId2);
                            if (lVar.f3619i != -1) {
                                obj.b(88, -2);
                                break;
                            }
                        } else if (i13 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            lVar.f3618h = string;
                            obj.c(90, string);
                            if (lVar.f3618h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                lVar.f3619i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                                break;
                            } else {
                                obj.b(88, -1);
                                break;
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index, lVar.f3619i));
                            break;
                        }
                        break;
                    case 87:
                        i10 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i10 = indexCount;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, kVar.L));
                        break;
                    case 94:
                        i10 = indexCount;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, kVar.S));
                        break;
                    case 95:
                        i10 = indexCount;
                        h(obj, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i10 = indexCount;
                        h(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i10 = indexCount;
                        obj.b(97, obtainStyledAttributes.getInt(index, kVar.o0));
                        break;
                    case 98:
                        i10 = indexCount;
                        int i14 = c0.a.N;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            jVar.f3566a = obtainStyledAttributes.getResourceId(index, jVar.f3566a);
                            break;
                        }
                    case 99:
                        i10 = indexCount;
                        obj.d(99, obtainStyledAttributes.getBoolean(index, kVar.f3585g));
                        break;
                }
                i11 = i12 + 1;
            }
        } else {
            int i15 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i15 < indexCount2; indexCount2 = i6) {
                int index2 = obtainStyledAttributes.getIndex(i15);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        lVar.getClass();
                        kVar.getClass();
                        nVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i6 = indexCount2;
                        kVar.f3601p = g(obtainStyledAttributes, index2, kVar.f3601p);
                        continue;
                    case 2:
                        i6 = indexCount2;
                        kVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.I);
                        continue;
                    case 3:
                        i6 = indexCount2;
                        kVar.f3600o = g(obtainStyledAttributes, index2, kVar.f3600o);
                        continue;
                    case 4:
                        i6 = indexCount2;
                        kVar.f3598n = g(obtainStyledAttributes, index2, kVar.f3598n);
                        continue;
                    case 5:
                        i6 = indexCount2;
                        kVar.f3609y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i6 = indexCount2;
                        kVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.C);
                        continue;
                    case 7:
                        i6 = indexCount2;
                        kVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.D);
                        continue;
                    case 8:
                        i6 = indexCount2;
                        kVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.J);
                        continue;
                    case 9:
                        i6 = indexCount2;
                        kVar.f3606v = g(obtainStyledAttributes, index2, kVar.f3606v);
                        continue;
                    case 10:
                        i6 = indexCount2;
                        kVar.f3605u = g(obtainStyledAttributes, index2, kVar.f3605u);
                        continue;
                    case 11:
                        i6 = indexCount2;
                        kVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.P);
                        continue;
                    case 12:
                        i6 = indexCount2;
                        kVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.Q);
                        continue;
                    case 13:
                        i6 = indexCount2;
                        kVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.M);
                        continue;
                    case 14:
                        i6 = indexCount2;
                        kVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.O);
                        continue;
                    case 15:
                        i6 = indexCount2;
                        kVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.R);
                        continue;
                    case 16:
                        i6 = indexCount2;
                        kVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.N);
                        continue;
                    case 17:
                        i6 = indexCount2;
                        kVar.f3579d = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f3579d);
                        continue;
                    case 18:
                        i6 = indexCount2;
                        kVar.f3581e = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f3581e);
                        continue;
                    case 19:
                        i6 = indexCount2;
                        kVar.f3583f = obtainStyledAttributes.getFloat(index2, kVar.f3583f);
                        continue;
                    case 20:
                        i6 = indexCount2;
                        kVar.f3607w = obtainStyledAttributes.getFloat(index2, kVar.f3607w);
                        continue;
                    case 21:
                        i6 = indexCount2;
                        kVar.f3577c = obtainStyledAttributes.getLayoutDimension(index2, kVar.f3577c);
                        continue;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                        i6 = indexCount2;
                        int i16 = obtainStyledAttributes.getInt(index2, mVar.f3620a);
                        mVar.f3620a = i16;
                        mVar.f3620a = iArr2[i16];
                        continue;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                        i6 = indexCount2;
                        kVar.f3575b = obtainStyledAttributes.getLayoutDimension(index2, kVar.f3575b);
                        continue;
                    case 24:
                        i6 = indexCount2;
                        kVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.F);
                        continue;
                    case 25:
                        i6 = indexCount2;
                        kVar.f3587h = g(obtainStyledAttributes, index2, kVar.f3587h);
                        continue;
                    case 26:
                        i6 = indexCount2;
                        kVar.f3589i = g(obtainStyledAttributes, index2, kVar.f3589i);
                        continue;
                    case 27:
                        i6 = indexCount2;
                        kVar.E = obtainStyledAttributes.getInt(index2, kVar.E);
                        continue;
                    case 28:
                        i6 = indexCount2;
                        kVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.G);
                        continue;
                    case 29:
                        i6 = indexCount2;
                        kVar.j = g(obtainStyledAttributes, index2, kVar.j);
                        continue;
                    case 30:
                        i6 = indexCount2;
                        kVar.f3592k = g(obtainStyledAttributes, index2, kVar.f3592k);
                        continue;
                    case 31:
                        i6 = indexCount2;
                        kVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.K);
                        continue;
                    case 32:
                        i6 = indexCount2;
                        kVar.s = g(obtainStyledAttributes, index2, kVar.s);
                        continue;
                    case 33:
                        i6 = indexCount2;
                        kVar.f3604t = g(obtainStyledAttributes, index2, kVar.f3604t);
                        continue;
                    case 34:
                        i6 = indexCount2;
                        kVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.H);
                        continue;
                    case 35:
                        i6 = indexCount2;
                        kVar.f3596m = g(obtainStyledAttributes, index2, kVar.f3596m);
                        continue;
                    case 36:
                        i6 = indexCount2;
                        kVar.f3594l = g(obtainStyledAttributes, index2, kVar.f3594l);
                        continue;
                    case 37:
                        i6 = indexCount2;
                        kVar.f3608x = obtainStyledAttributes.getFloat(index2, kVar.f3608x);
                        continue;
                    case 38:
                        i6 = indexCount2;
                        jVar.f3566a = obtainStyledAttributes.getResourceId(index2, jVar.f3566a);
                        continue;
                    case 39:
                        i6 = indexCount2;
                        kVar.U = obtainStyledAttributes.getFloat(index2, kVar.U);
                        continue;
                    case 40:
                        i6 = indexCount2;
                        kVar.T = obtainStyledAttributes.getFloat(index2, kVar.T);
                        continue;
                    case 41:
                        i6 = indexCount2;
                        kVar.V = obtainStyledAttributes.getInt(index2, kVar.V);
                        continue;
                    case 42:
                        i6 = indexCount2;
                        kVar.W = obtainStyledAttributes.getInt(index2, kVar.W);
                        continue;
                    case 43:
                        i6 = indexCount2;
                        mVar.f3622c = obtainStyledAttributes.getFloat(index2, mVar.f3622c);
                        continue;
                    case 44:
                        i6 = indexCount2;
                        nVar.f3635l = true;
                        nVar.f3636m = obtainStyledAttributes.getDimension(index2, nVar.f3636m);
                        continue;
                    case 45:
                        i6 = indexCount2;
                        nVar.f3626b = obtainStyledAttributes.getFloat(index2, nVar.f3626b);
                        continue;
                    case 46:
                        i6 = indexCount2;
                        nVar.f3627c = obtainStyledAttributes.getFloat(index2, nVar.f3627c);
                        continue;
                    case 47:
                        i6 = indexCount2;
                        nVar.f3628d = obtainStyledAttributes.getFloat(index2, nVar.f3628d);
                        continue;
                    case 48:
                        i6 = indexCount2;
                        nVar.f3629e = obtainStyledAttributes.getFloat(index2, nVar.f3629e);
                        continue;
                    case 49:
                        i6 = indexCount2;
                        nVar.f3630f = obtainStyledAttributes.getDimension(index2, nVar.f3630f);
                        continue;
                    case 50:
                        i6 = indexCount2;
                        nVar.f3631g = obtainStyledAttributes.getDimension(index2, nVar.f3631g);
                        continue;
                    case 51:
                        i6 = indexCount2;
                        nVar.f3633i = obtainStyledAttributes.getDimension(index2, nVar.f3633i);
                        continue;
                    case 52:
                        i6 = indexCount2;
                        nVar.j = obtainStyledAttributes.getDimension(index2, nVar.j);
                        continue;
                    case 53:
                        i6 = indexCount2;
                        nVar.f3634k = obtainStyledAttributes.getDimension(index2, nVar.f3634k);
                        continue;
                    case 54:
                        i6 = indexCount2;
                        kVar.X = obtainStyledAttributes.getInt(index2, kVar.X);
                        continue;
                    case 55:
                        i6 = indexCount2;
                        kVar.Y = obtainStyledAttributes.getInt(index2, kVar.Y);
                        continue;
                    case 56:
                        i6 = indexCount2;
                        kVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.Z);
                        continue;
                    case 57:
                        i6 = indexCount2;
                        kVar.f3574a0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3574a0);
                        continue;
                    case 58:
                        i6 = indexCount2;
                        kVar.f3576b0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3576b0);
                        continue;
                    case 59:
                        i6 = indexCount2;
                        kVar.f3578c0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3578c0);
                        continue;
                    case 60:
                        i6 = indexCount2;
                        nVar.f3625a = obtainStyledAttributes.getFloat(index2, nVar.f3625a);
                        continue;
                    case 61:
                        i6 = indexCount2;
                        kVar.f3610z = g(obtainStyledAttributes, index2, kVar.f3610z);
                        continue;
                    case 62:
                        i6 = indexCount2;
                        kVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.A);
                        continue;
                    case 63:
                        i6 = indexCount2;
                        kVar.B = obtainStyledAttributes.getFloat(index2, kVar.B);
                        continue;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        i6 = indexCount2;
                        lVar.f3611a = g(obtainStyledAttributes, index2, lVar.f3611a);
                        continue;
                    case 65:
                        i6 = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            lVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                            break;
                        }
                    case 66:
                        i6 = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        continue;
                    case 67:
                        i6 = indexCount2;
                        lVar.f3615e = obtainStyledAttributes.getFloat(index2, lVar.f3615e);
                        break;
                    case 68:
                        i6 = indexCount2;
                        mVar.f3623d = obtainStyledAttributes.getFloat(index2, mVar.f3623d);
                        break;
                    case 69:
                        i6 = indexCount2;
                        kVar.f3580d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i6 = indexCount2;
                        kVar.f3582e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i6 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i6 = indexCount2;
                        kVar.f3584f0 = obtainStyledAttributes.getInt(index2, kVar.f3584f0);
                        break;
                    case 73:
                        i6 = indexCount2;
                        kVar.f3586g0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f3586g0);
                        break;
                    case 74:
                        i6 = indexCount2;
                        kVar.f3591j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i6 = indexCount2;
                        kVar.f3599n0 = obtainStyledAttributes.getBoolean(index2, kVar.f3599n0);
                        break;
                    case 76:
                        i6 = indexCount2;
                        lVar.f3613c = obtainStyledAttributes.getInt(index2, lVar.f3613c);
                        break;
                    case 77:
                        i6 = indexCount2;
                        kVar.f3593k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i6 = indexCount2;
                        mVar.f3621b = obtainStyledAttributes.getInt(index2, mVar.f3621b);
                        break;
                    case 79:
                        i6 = indexCount2;
                        lVar.f3614d = obtainStyledAttributes.getFloat(index2, lVar.f3614d);
                        break;
                    case 80:
                        i6 = indexCount2;
                        kVar.f3595l0 = obtainStyledAttributes.getBoolean(index2, kVar.f3595l0);
                        break;
                    case 81:
                        i6 = indexCount2;
                        kVar.f3597m0 = obtainStyledAttributes.getBoolean(index2, kVar.f3597m0);
                        break;
                    case 82:
                        i6 = indexCount2;
                        lVar.f3612b = obtainStyledAttributes.getInteger(index2, lVar.f3612b);
                        break;
                    case 83:
                        i6 = indexCount2;
                        nVar.f3632h = g(obtainStyledAttributes, index2, nVar.f3632h);
                        break;
                    case 84:
                        i6 = indexCount2;
                        lVar.f3617g = obtainStyledAttributes.getInteger(index2, lVar.f3617g);
                        break;
                    case 85:
                        i6 = indexCount2;
                        lVar.f3616f = obtainStyledAttributes.getFloat(index2, lVar.f3616f);
                        break;
                    case 86:
                        i6 = indexCount2;
                        int i17 = obtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            lVar.f3619i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i17 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            lVar.f3618h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.f3619i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, lVar.f3619i);
                            break;
                        }
                        break;
                    case 87:
                        i6 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i6 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i6 = indexCount2;
                        kVar.f3602q = g(obtainStyledAttributes, index2, kVar.f3602q);
                        break;
                    case 92:
                        i6 = indexCount2;
                        kVar.f3603r = g(obtainStyledAttributes, index2, kVar.f3603r);
                        break;
                    case 93:
                        i6 = indexCount2;
                        kVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.L);
                        break;
                    case 94:
                        i6 = indexCount2;
                        kVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.S);
                        break;
                    case 95:
                        i6 = indexCount2;
                        h(kVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i6 = indexCount2;
                        h(kVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i6 = indexCount2;
                        kVar.o0 = obtainStyledAttributes.getInt(index2, kVar.o0);
                        break;
                }
                i15++;
            }
            if (kVar.f3591j0 != null) {
                kVar.f3590i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return jVar;
    }

    public static int g(TypedArray typedArray, int i6, int i10) {
        int resourceId = typedArray.getResourceId(i6, i10);
        if (resourceId == -1) {
            return typedArray.getInt(i6, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r8 == (-1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.o.h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void i(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i6 = 0;
            int i10 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i6 = 1;
                    } else {
                        i6 = -1;
                    }
                }
                i10 = i6;
                i6 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i6, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && parseFloat2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (i10 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i6);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.G = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x010f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [d0.a, android.view.View, d0.c] */
    /* JADX WARN: Type inference failed for: r8v2, types: [a0.i, a0.a] */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i6;
        String str;
        HashMap hashMap;
        String str2;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = oVar.f3642c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb2.append(str2);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (oVar.f3641b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        j jVar = (j) hashMap2.get(Integer.valueOf(id2));
                        if (jVar != null) {
                            m mVar = jVar.f3567b;
                            k kVar = jVar.f3569d;
                            n nVar = jVar.f3570e;
                            if (childAt instanceof a) {
                                kVar.f3588h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id2);
                                aVar.setType(kVar.f3584f0);
                                aVar.setMargin(kVar.f3586g0);
                                aVar.setAllowsGoneWidget(kVar.f3599n0);
                                int[] iArr = kVar.f3590i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = kVar.f3591j0;
                                    if (str3 != null) {
                                        int[] c10 = c(aVar, str3);
                                        kVar.f3590i0 = c10;
                                        aVar.setReferencedIds(c10);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap hashMap3 = jVar.f3571f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                b bVar = (b) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (!bVar.f3489a) {
                                    str = r4.a.k("set", str4);
                                } else {
                                    str = str4;
                                }
                                int i11 = i10;
                                try {
                                    int c11 = y.e.c(bVar.f3490b);
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (c11) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3491c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.f3492d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3495g));
                                            break;
                                        case 3:
                                            hashMap = hashMap3;
                                            Method method = cls.getMethod(str, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar.f3495g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f3493e);
                                            break;
                                        case 5:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f3494f));
                                            break;
                                        case 6:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(bVar.f3492d));
                                            break;
                                        case 7:
                                            hashMap = hashMap3;
                                            try {
                                                cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(bVar.f3491c));
                                            } catch (IllegalAccessException e10) {
                                                e = e10;
                                                StringBuilder q9 = r4.a.q(" Custom Attribute \"", str4, "\" not found on ");
                                                q9.append(cls.getName());
                                                Log.e("TransitionLayout", q9.toString(), e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e11) {
                                                e = e11;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e12) {
                                                e = e12;
                                                StringBuilder q10 = r4.a.q(" Custom Attribute \"", str4, "\" not found on ");
                                                q10.append(cls.getName());
                                                Log.e("TransitionLayout", q10.toString(), e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                hashMap3 = hashMap;
                                            }
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e13) {
                                    e = e13;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e14) {
                                    e = e14;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e15) {
                                    e = e15;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i10 = i11;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i6 = i10;
                            childAt.setLayoutParams(eVar);
                            if (mVar.f3621b == 0) {
                                childAt.setVisibility(mVar.f3620a);
                            }
                            childAt.setAlpha(mVar.f3622c);
                            childAt.setRotation(nVar.f3625a);
                            childAt.setRotationX(nVar.f3626b);
                            childAt.setRotationY(nVar.f3627c);
                            childAt.setScaleX(nVar.f3628d);
                            childAt.setScaleY(nVar.f3629e);
                            if (nVar.f3632h != -1) {
                                if (((View) childAt.getParent()).findViewById(nVar.f3632h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f3630f)) {
                                    childAt.setPivotX(nVar.f3630f);
                                }
                                if (!Float.isNaN(nVar.f3631g)) {
                                    childAt.setPivotY(nVar.f3631g);
                                }
                            }
                            childAt.setTranslationX(nVar.f3633i);
                            childAt.setTranslationY(nVar.j);
                            childAt.setTranslationZ(nVar.f3634k);
                            if (nVar.f3635l) {
                                childAt.setElevation(nVar.f3636m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i6 = i10;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                    i10 = i6 + 1;
                    oVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i6 = i10;
            i10 = i6 + 1;
            oVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            j jVar2 = (j) hashMap2.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.f3569d;
                if (kVar2.f3588h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.f3496x = new int[32];
                    view.D = new HashMap();
                    view.f3498z = context;
                    ?? iVar = new a0.i();
                    iVar.f1s0 = 0;
                    iVar.f2t0 = true;
                    iVar.f3u0 = 0;
                    iVar.f4v0 = false;
                    view.G = iVar;
                    view.A = iVar;
                    view.i();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = kVar2.f3590i0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str5 = kVar2.f3591j0;
                        if (str5 != null) {
                            int[] c12 = c(view, str5);
                            kVar2.f3590i0 = c12;
                            view.setReferencedIds(c12);
                        }
                    }
                    view.setType(kVar2.f3584f0);
                    view.setMargin(kVar2.f3586g0);
                    e g10 = ConstraintLayout.g();
                    view.i();
                    jVar2.a(g10);
                    constraintLayout.addView((View) view, g10);
                }
                if (kVar2.f3573a) {
                    q qVar = new q(constraintLayout.getContext());
                    qVar.setId(num.intValue());
                    e g11 = ConstraintLayout.g();
                    jVar2.a(g11);
                    constraintLayout.addView(qVar, g11);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i6;
        HashMap hashMap;
        int i10;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = oVar.f3642c;
        hashMap2.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (oVar.f3641b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                hashMap2.put(Integer.valueOf(id2), new j());
            }
            j jVar = (j) hashMap2.get(Integer.valueOf(id2));
            if (jVar == null) {
                i6 = childCount;
                hashMap = hashMap2;
                i10 = i11;
            } else {
                m mVar = jVar.f3567b;
                k kVar = jVar.f3569d;
                n nVar = jVar.f3570e;
                i6 = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i10 = i11;
                HashMap hashMap4 = oVar.f3640a;
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e10) {
                        StringBuilder q9 = r4.a.q(" Custom Attribute \"", str, "\" not found on ");
                        q9.append(cls.getName());
                        Log.e("TransitionLayout", q9.toString(), e10);
                    } catch (NoSuchMethodException e11) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e11);
                    } catch (InvocationTargetException e12) {
                        StringBuilder q10 = r4.a.q(" Custom Attribute \"", str, "\" not found on ");
                        q10.append(cls.getName());
                        Log.e("TransitionLayout", q10.toString(), e12);
                    }
                    hashMap4 = hashMap5;
                }
                jVar.f3571f = hashMap3;
                jVar.f3566a = id2;
                kVar.f3587h = eVar.f3508e;
                kVar.f3589i = eVar.f3510f;
                kVar.j = eVar.f3512g;
                kVar.f3592k = eVar.f3514h;
                kVar.f3594l = eVar.f3516i;
                kVar.f3596m = eVar.j;
                kVar.f3598n = eVar.f3519k;
                kVar.f3600o = eVar.f3521l;
                kVar.f3601p = eVar.f3523m;
                kVar.f3602q = eVar.f3525n;
                kVar.f3603r = eVar.f3527o;
                kVar.s = eVar.s;
                kVar.f3604t = eVar.f3532t;
                kVar.f3605u = eVar.f3533u;
                kVar.f3606v = eVar.f3534v;
                kVar.f3607w = eVar.E;
                kVar.f3608x = eVar.F;
                kVar.f3609y = eVar.G;
                kVar.f3610z = eVar.f3528p;
                kVar.A = eVar.f3530q;
                kVar.B = eVar.f3531r;
                kVar.C = eVar.T;
                kVar.D = eVar.U;
                kVar.E = eVar.V;
                kVar.f3583f = eVar.f3504c;
                kVar.f3579d = eVar.f3500a;
                kVar.f3581e = eVar.f3502b;
                kVar.f3575b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f3577c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.L = eVar.D;
                kVar.T = eVar.I;
                kVar.U = eVar.H;
                kVar.W = eVar.K;
                kVar.V = eVar.J;
                kVar.f3595l0 = eVar.W;
                kVar.f3597m0 = eVar.X;
                kVar.X = eVar.L;
                kVar.Y = eVar.M;
                kVar.Z = eVar.P;
                kVar.f3574a0 = eVar.Q;
                kVar.f3576b0 = eVar.N;
                kVar.f3578c0 = eVar.O;
                kVar.f3580d0 = eVar.R;
                kVar.f3582e0 = eVar.S;
                kVar.f3593k0 = eVar.Y;
                kVar.N = eVar.f3536x;
                kVar.P = eVar.f3538z;
                kVar.M = eVar.f3535w;
                kVar.O = eVar.f3537y;
                kVar.R = eVar.A;
                kVar.Q = eVar.B;
                kVar.S = eVar.C;
                kVar.o0 = eVar.Z;
                kVar.J = eVar.getMarginEnd();
                kVar.K = eVar.getMarginStart();
                mVar.f3620a = childAt.getVisibility();
                mVar.f3622c = childAt.getAlpha();
                nVar.f3625a = childAt.getRotation();
                nVar.f3626b = childAt.getRotationX();
                nVar.f3627c = childAt.getRotationY();
                nVar.f3628d = childAt.getScaleX();
                nVar.f3629e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f3630f = pivotX;
                    nVar.f3631g = pivotY;
                }
                nVar.f3633i = childAt.getTranslationX();
                nVar.j = childAt.getTranslationY();
                nVar.f3634k = childAt.getTranslationZ();
                if (nVar.f3635l) {
                    nVar.f3636m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.f3599n0 = aVar.getAllowsGoneWidget();
                    kVar.f3590i0 = aVar.getReferencedIds();
                    kVar.f3584f0 = aVar.getType();
                    kVar.f3586g0 = aVar.getMargin();
                }
            }
            i11 = i10 + 1;
            oVar = this;
            childCount = i6;
            hashMap2 = hashMap;
        }
    }

    public final j e(int i6) {
        Integer valueOf = Integer.valueOf(i6);
        HashMap hashMap = this.f3642c;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i6), new j());
        }
        return (j) hashMap.get(Integer.valueOf(i6));
    }

    public final void f(Context context, int i6) {
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    j d10 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d10.f3569d.f3573a = true;
                    }
                    this.f3642c.put(Integer.valueOf(d10.f3566a), d10);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i6, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i6, e11);
        }
    }
}
