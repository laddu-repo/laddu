package com.bumptech.glide;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import ke.p;
import me.q;
import o.z0;
import o9.w;
import p4.v;
import r2.s;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final boolean B(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static sd.h C(sd.f fVar, sd.g gVar) {
        de.i.e(gVar, "key");
        return de.i.a(fVar.getKey(), gVar) ? sd.i.f11797v : fVar;
    }

    public static String F(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb2 = new StringBuilder("sha256/");
        vf.f fVar = vf.f.f13604y;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        de.i.d(encoded, "getEncoded(...)");
        int length = encoded.length;
        int i = 0;
        t1.c(encoded.length, 0, length);
        byte[] bArrB0 = pd.i.b0(encoded, 0, length);
        vf.f fVar2 = new vf.f(bArrB0);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrB0, 0, fVar2.a());
        byte[] bArrDigest = messageDigest.digest();
        de.i.b(bArrDigest);
        new vf.f(bArrDigest);
        byte[] bArr = vf.a.f13594a;
        de.i.e(bArr, "map");
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i10 = 0;
        while (i < length2) {
            byte b9 = bArrDigest[i];
            int i11 = i + 2;
            byte b10 = bArrDigest[i + 1];
            i += 3;
            byte b11 = bArrDigest[i11];
            bArr2[i10] = bArr[(b9 & 255) >> 2];
            bArr2[i10 + 1] = bArr[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = bArr[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i10 += 4;
            bArr2[i12] = bArr[b11 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b12 = bArrDigest[i];
            bArr2[i10] = bArr[(b12 & 255) >> 2];
            bArr2[i10 + 1] = bArr[(b12 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        } else if (length3 == 2) {
            int i13 = i + 1;
            byte b13 = bArrDigest[i];
            byte b14 = bArrDigest[i13];
            bArr2[i10] = bArr[(b13 & 255) >> 2];
            bArr2[i10 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i10 + 2] = bArr[(b14 & 15) << 2];
            bArr2[i10 + 3] = 61;
        }
        sb2.append(new String(bArr2, ke.a.f7954a));
        return sb2.toString();
    }

    public static sd.h G(sd.f fVar, sd.h hVar) {
        de.i.e(hVar, "context");
        return hVar == sd.i.f11797v ? fVar : (sd.h) hVar.m(fVar, new q(8));
    }

    public static void H(v1.a aVar) {
        aVar.f13037k = -3.4028235E38f;
        aVar.f13036j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f13029a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f13029a = SpannableString.valueOf(charSequence);
                aVar.f13030b = null;
            }
            CharSequence charSequence2 = aVar.f13029a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float I(int i, float f, int i10, int i11) {
        float f4;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f4 = i11;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f4 = i10;
        }
        return f * f4;
    }

    public static void J(TextView textView, int i) {
        u1.c.e(i);
        if (Build.VERSION.SDK_INT >= 28) {
            j0.a.m(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void K(TextView textView, int i) {
        u1.c.e(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i10);
        }
    }

    public static void L(TextView textView, int i) {
        u1.c.e(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void M(View view, o9.i iVar) {
        e9.a aVar = iVar.f10018w.f10002c;
        if (aVar == null || !aVar.f4861a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        o9.g gVar = iVar.f10018w;
        if (gVar.f10010m != elevation) {
            gVar.f10010m = elevation;
            iVar.x();
        }
    }

    public static ActionMode.Callback P(ActionMode.Callback callback) {
        return (!(callback instanceof x0.h) || Build.VERSION.SDK_INT < 26) ? callback : ((x0.h) callback).f14080a;
    }

    public static ActionMode.Callback R(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof x0.h) || callback == null) ? callback : new x0.h(callback, textView);
    }

    public static void S(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        parcel.writeBundle(bundle);
        d0(parcel, iC0);
    }

    public static void T(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        parcel.writeByteArray(bArr);
        d0(parcel, iC0);
    }

    public static void U(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        d0(parcel, iC0);
    }

    public static void V(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        d0(parcel, iC0);
    }

    public static void W(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        parcel.writeIntArray(iArr);
        d0(parcel, iC0);
    }

    public static void X(Parcel parcel, int i, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        parcelable.writeToParcel(parcel, i10);
        d0(parcel, iC0);
    }

    public static void Y(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        parcel.writeString(str);
        d0(parcel, iC0);
    }

    public static void Z(Parcel parcel, int i, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        d0(parcel, iC0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.List r6, d1.k r7, ud.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof d1.e
            if (r0 == 0) goto L13
            r0 = r8
            d1.e r0 = (d1.e) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            d1.e r0 = new d1.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.A
            int r1 = r0.B
            r2 = 2
            r3 = 1
            td.a r4 = td.a.f12544v
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.util.Iterator r6 = r0.f3863z
            java.io.Serializable r7 = r0.f3862y
            de.p r7 = (de.p) r7
            fa.b.z(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f3862y
            java.util.List r6 = (java.util.List) r6
            fa.b.z(r8)
            goto L5c
        L42:
            fa.b.z(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            d1.g r1 = new d1.g
            r5 = 0
            r1.<init>(r6, r8, r5)
            r0.f3862y = r8
            r0.B = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r4) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            de.p r7 = new de.p
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            ce.l r8 = (ce.l) r8
            r0.f3862y = r7     // Catch: java.lang.Throwable -> L30
            r0.f3863z = r6     // Catch: java.lang.Throwable -> L30
            r0.B = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r4) goto L65
            goto L93
        L7e:
            java.lang.Object r1 = r7.f4522v
            if (r1 != 0) goto L85
            r7.f4522v = r8
            goto L65
        L85:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.bumptech.glide.e.a(r1, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f4522v
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            od.l r4 = od.l.f10126a
        L93:
            return r4
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.a(java.util.List, d1.k, ud.c):java.lang.Object");
    }

    public static void a0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iC0 = c0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        d0(parcel, iC0);
    }

    public static void b0(Parcel parcel, int i, int i10) {
        parcel.writeInt(i | (i10 << 16));
    }

    public static int c0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void d(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbO = d0.d.o(i, "radix ", " was not in valid range ");
            sbO.append(new he.c(2, 36, 1));
            throw new IllegalArgumentException(sbO.toString());
        }
    }

    public static void d0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final int e(v4.c cVar, String str) {
        de.i.e(cVar, "<this>");
        int iF = f(cVar, str);
        if (iF >= 0) {
            return iF;
        }
        int iF2 = f(cVar, "`" + str + '`');
        if (iF2 >= 0) {
            return iF2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        String strConcat = ".".concat(str);
        String str2 = "." + str + '`';
        for (int i = 0; i < columnCount; i++) {
            String columnName = cVar.getColumnName(i);
            if (columnName.length() >= str.length() + 2 && (p.x(columnName, strConcat) || (columnName.charAt(0) == '`' && p.x(columnName, str2)))) {
                return i;
            }
        }
        return -1;
    }

    public static final int f(v4.c cVar, String str) {
        de.i.e(cVar, "<this>");
        de.i.e(str, "name");
        int columnCount = cVar.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (str.equals(cVar.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static c g(int i) {
        return i != 0 ? i != 1 ? new o9.k() : new o9.e() : new o9.k();
    }

    public static s2.h h(s sVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (sVar.b(i10, jElapsedRealtime)) {
                i++;
            }
        }
        return new s2.h(1, 0, length, i);
    }

    public static final boolean i(char c10, char c11, boolean z2) {
        if (c10 == c11) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static String j(androidx.datastore.preferences.protobuf.g gVar) {
        StringBuilder sb2 = new StringBuilder(gVar.size());
        for (int i = 0; i < gVar.size(); i++) {
            byte bA = gVar.a(i);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb2.append("\\a");
                        break;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static sd.f k(sd.f fVar, sd.g gVar) {
        de.i.e(gVar, "key");
        if (de.i.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final ie.b l(ye.d dVar) {
        de.i.e(dVar, "<this>");
        if (dVar instanceof af.o) {
            return l(((af.o) dVar).f528a);
        }
        return null;
    }

    public static final int m(v4.c cVar, String str) {
        de.i.e(cVar, "stmt");
        int iE = e(cVar, str);
        if (iE >= 0) {
            return iE;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(cVar.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + pd.j.I(arrayList, null, null, null, null, 63) + ']');
    }

    public static long u(double d10) {
        v.i("not a normal value", y(d10));
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static r0.d v(z0 z0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new r0.d(j0.a.j(z0Var));
        }
        TextPaint textPaint = new TextPaint(z0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = z0Var.getBreakStrategy();
        int hyphenationFrequency = z0Var.getHyphenationFrequency();
        if (z0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (z0Var.getInputType() & 15) != 3) {
            boolean z2 = z0Var.getLayoutDirection() == 1;
            switch (z0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case g1.g.LONG_FIELD_NUMBER /* 4 */:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case g1.g.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(j0.a.a(p0.d.c(z0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new r0.d(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean y(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public abstract boolean A(float f, float f4);

    public abstract void D(int i);

    public abstract void E(Typeface typeface, boolean z2);

    public abstract void N(w wVar, float f);

    public abstract boolean O(View view, float f);

    public abstract void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i10);

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float c(int i);

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r(View view);

    public abstract int s(CoordinatorLayout coordinatorLayout);

    public abstract int t();

    public abstract float w(w wVar);

    public abstract boolean x(float f);

    public abstract boolean z(View view);
}
