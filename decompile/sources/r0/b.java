package r0;

import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.measurement.p4;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f11245b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11246c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f11247d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f11248e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11249a;

    static {
        p4 p4Var = f.f11257c;
        f11245b = Character.toString((char) 8206);
        f11246c = Character.toString((char) 8207);
        f11247d = new b(false);
        f11248e = new b(true);
    }

    public b(boolean z10) {
        p4 p4Var = f.f11255a;
        this.f11249a = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.f11243c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            r0.a r0 = new r0.a
            r0.<init>(r9)
            r9 = 0
            r0.f11243c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r0.f11243c
            int r5 = r0.f11242b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f11241a
            char r4 = r5.charAt(r4)
            r0.f11244d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f11243c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f11243c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f11243c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f11243c
            int r4 = r4 + r7
            r0.f11243c = r4
            char r4 = r0.f11244d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = r0.a.f11240e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = 0
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = 1
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = -1
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L85
        L69:
            if (r3 != 0) goto L6c
            goto L8b
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8c
        L71:
            if (r2 == 0) goto L74
            return r2
        L74:
            int r2 = r0.f11243c
            if (r2 <= 0) goto L8c
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L89;
                case 15: goto L89;
                case 16: goto L83;
                case 17: goto L83;
                case 18: goto L80;
                default: goto L7f;
            }
        L7f:
            goto L74
        L80:
            int r3 = r3 + 1
            goto L74
        L83:
            if (r1 != r3) goto L86
        L85:
            return r7
        L86:
            int r3 = r3 + (-1)
            goto L74
        L89:
            if (r1 != r3) goto L86
        L8b:
            return r6
        L8c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0020. Please report as an issue. */
    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f11243c = aVar.f11242b;
        int i6 = 0;
        int i10 = 0;
        while (aVar.f11243c > 0) {
            byte a10 = aVar.a();
            if (a10 != 0) {
                if (a10 != 1 && a10 != 2) {
                    if (a10 != 9) {
                        switch (a10) {
                            case 14:
                            case 15:
                                if (i10 == i6) {
                                    return -1;
                                }
                                i6--;
                                break;
                            case 16:
                            case 17:
                                if (i10 == i6) {
                                    return 1;
                                }
                                i6--;
                                break;
                            case 18:
                                i6++;
                                break;
                            default:
                                if (i10 != 0) {
                                    break;
                                } else {
                                    i10 = i6;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i6 == 0) {
                        return 1;
                    }
                    if (i10 == 0) {
                        i10 = i6;
                    }
                }
            } else {
                if (i6 == 0) {
                    return -1;
                }
                if (i10 == 0) {
                    i10 = i6;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        p4 p4Var;
        String str;
        p4 p4Var2;
        char c10;
        p4 p4Var3 = f.f11257c;
        if (charSequence == null) {
            return null;
        }
        boolean e10 = p4Var3.e(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (e10) {
            p4Var = f.f11256b;
        } else {
            p4Var = f.f11255a;
        }
        boolean e11 = p4Var.e(charSequence, charSequence.length());
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str3 = f11246c;
        String str4 = f11245b;
        boolean z10 = this.f11249a;
        if (!z10 && (e11 || a(charSequence) == 1)) {
            str = str4;
        } else if (z10 && (!e11 || a(charSequence) == -1)) {
            str = str3;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (e10 != z10) {
            if (e10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (e10) {
            p4Var2 = f.f11256b;
        } else {
            p4Var2 = f.f11255a;
        }
        boolean e12 = p4Var2.e(charSequence, charSequence.length());
        if (!z10 && (e12 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!e12 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
