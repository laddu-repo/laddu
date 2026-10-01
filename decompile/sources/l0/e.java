package l0;

import android.graphics.Path;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public char f8067a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f8068b;

    public e(char c10, float[] fArr) {
        this.f8067a = c10;
        this.f8068b = fArr;
    }

    public static void a(Path path, float f3, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        double d10;
        double d11;
        boolean z12;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d12 = f3;
        double d13 = f10;
        double d14 = f13;
        double d15 = ((d13 * sin) + (d12 * cos)) / d14;
        double d16 = f14;
        double d17 = ((d13 * cos) + ((-f3) * sin)) / d16;
        double d18 = f12;
        double d19 = ((d18 * sin) + (f11 * cos)) / d14;
        double d20 = ((d18 * cos) + ((-f11) * sin)) / d16;
        double d21 = d15 - d19;
        double d22 = d17 - d20;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d17 + d20) / 2.0d;
        double d25 = (d22 * d22) + (d21 * d21);
        if (d25 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d25);
            float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
            a(path, f3, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d26);
        double d27 = sqrt2 * d21;
        double d28 = sqrt2 * d22;
        if (z10 == z11) {
            d10 = d23 - d28;
            d11 = d24 + d27;
        } else {
            d10 = d23 + d28;
            d11 = d24 - d27;
        }
        double atan2 = Math.atan2(d17 - d11, d15 - d10);
        double atan22 = Math.atan2(d20 - d11, d19 - d10) - atan2;
        if (atan22 >= 0.0d) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d29 = d10 * d14;
        double d30 = d11 * d16;
        double d31 = (d29 * cos) - (d30 * sin);
        double d32 = (d30 * cos) + (d29 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d33 = d13;
        double d34 = -d14;
        double d35 = d34 * cos2;
        double d36 = d16 * sin2;
        double d37 = (d35 * sin3) - (d36 * cos3);
        double d38 = d34 * sin2;
        double d39 = d16 * cos2;
        double d40 = (cos3 * d39) + (sin3 * d38);
        double d41 = atan22 / ceil;
        double d42 = atan2;
        int i6 = 0;
        while (i6 < ceil) {
            double d43 = d42 + d41;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            int i10 = ceil;
            double d44 = (((d14 * cos2) * cos4) + d31) - (d36 * sin4);
            double d45 = d38;
            double d46 = (d39 * sin4) + (d14 * sin2 * cos4) + d32;
            double d47 = (d35 * sin4) - (d36 * cos4);
            double d48 = (cos4 * d39) + (sin4 * d45);
            double d49 = d43 - d42;
            double tan = Math.tan(d49 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
            path.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo((float) ((d37 * sqrt3) + d12), (float) ((d40 * sqrt3) + d33), (float) (d44 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d44, (float) d46);
            i6++;
            d12 = d44;
            d33 = d46;
            d31 = d31;
            d42 = d43;
            cos2 = cos2;
            d40 = d48;
            d37 = d47;
            ceil = i10;
            d41 = d41;
            d38 = d45;
        }
    }

    public static void b(e[] eVarArr, Path path) {
        int i6;
        float[] fArr;
        int i10;
        e eVar;
        int i11;
        char c10;
        boolean z10;
        boolean z11;
        float f3;
        float f10;
        e eVar2;
        boolean z12;
        boolean z13;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr2.length;
        char c11 = 0;
        char c12 = 'm';
        int i12 = 0;
        while (i12 < length) {
            e eVar3 = eVarArr2[i12];
            char c13 = eVar3.f8067a;
            float[] fArr3 = eVar3.f8068b;
            float f19 = fArr2[c11];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            float f23 = fArr2[4];
            float f24 = fArr2[5];
            switch (c13) {
                case 'A':
                case 'a':
                    i6 = 7;
                    break;
                case 'C':
                case 'c':
                    i6 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i6 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i6 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                    break;
            }
            i6 = 2;
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i13 = 0;
            while (i13 < fArr3.length) {
                if (c13 != 'A') {
                    if (c13 != 'C') {
                        if (c13 != 'H') {
                            if (c13 != 'Q') {
                                if (c13 != 'V') {
                                    if (c13 != 'a') {
                                        if (c13 != 'c') {
                                            if (c13 != 'h') {
                                                if (c13 != 'q') {
                                                    if (c13 != 'v') {
                                                        if (c13 != 'L') {
                                                            if (c13 != 'M') {
                                                                if (c13 != 'S') {
                                                                    if (c13 != 'T') {
                                                                        if (c13 != 'l') {
                                                                            if (c13 != 'm') {
                                                                                if (c13 != 's') {
                                                                                    if (c13 != 't') {
                                                                                        fArr = fArr3;
                                                                                        i10 = i13;
                                                                                        eVar = eVar3;
                                                                                        f10 = f27;
                                                                                    } else {
                                                                                        if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                            f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                                                            f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                                                        } else {
                                                                                            f17 = f27 - f21;
                                                                                            f18 = f28 - f22;
                                                                                        }
                                                                                        int i14 = i13 + 1;
                                                                                        path2.rQuadTo(f17, f18, fArr3[i13], fArr3[i14]);
                                                                                        float f29 = f17 + f27;
                                                                                        float f30 = f18 + f28;
                                                                                        float f31 = f27 + fArr3[i13];
                                                                                        f28 += fArr3[i14];
                                                                                        f22 = f30;
                                                                                        fArr = fArr3;
                                                                                        i10 = i13;
                                                                                        eVar = eVar3;
                                                                                        f10 = f31;
                                                                                        f21 = f29;
                                                                                    }
                                                                                    f3 = f28;
                                                                                } else {
                                                                                    if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                        f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                                                        f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                                                    } else {
                                                                                        f15 = f28 - f22;
                                                                                        f16 = f27 - f21;
                                                                                    }
                                                                                    int i15 = i13;
                                                                                    int i16 = i15 + 1;
                                                                                    int i17 = i15 + 2;
                                                                                    int i18 = i15 + 3;
                                                                                    fArr = fArr3;
                                                                                    i10 = i15;
                                                                                    path2.rCubicTo(f16, f15, fArr3[i15], fArr3[i16], fArr3[i17], fArr3[i18]);
                                                                                    f11 = fArr[i10] + f27;
                                                                                    f12 = fArr[i16] + f28;
                                                                                    f27 += fArr[i17];
                                                                                    f13 = fArr[i18];
                                                                                }
                                                                            } else {
                                                                                fArr = fArr3;
                                                                                i10 = i13;
                                                                                float f32 = fArr[i10];
                                                                                f27 += f32;
                                                                                float f33 = fArr[i10 + 1];
                                                                                f28 += f33;
                                                                                if (i10 > 0) {
                                                                                    path2.rLineTo(f32, f33);
                                                                                } else {
                                                                                    path2.rMoveTo(f32, f33);
                                                                                    eVar = eVar3;
                                                                                    f10 = f27;
                                                                                    f25 = f10;
                                                                                    f3 = f28;
                                                                                    f26 = f3;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            fArr = fArr3;
                                                                            i10 = i13;
                                                                            int i19 = i10 + 1;
                                                                            path2.rLineTo(fArr[i10], fArr[i19]);
                                                                            f27 += fArr[i10];
                                                                            f14 = fArr[i19];
                                                                        }
                                                                    } else {
                                                                        fArr = fArr3;
                                                                        i10 = i13;
                                                                        if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                                            f27 = (f27 * 2.0f) - f21;
                                                                            f28 = (f28 * 2.0f) - f22;
                                                                        }
                                                                        int i20 = i10 + 1;
                                                                        path2.quadTo(f27, f28, fArr[i10], fArr[i20]);
                                                                        f10 = fArr[i10];
                                                                        f3 = fArr[i20];
                                                                        eVar = eVar3;
                                                                        f21 = f27;
                                                                        f22 = f28;
                                                                    }
                                                                    i11 = i12;
                                                                    c10 = c13;
                                                                } else {
                                                                    fArr = fArr3;
                                                                    i10 = i13;
                                                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                                        f27 = (f27 * 2.0f) - f21;
                                                                        f28 = (f28 * 2.0f) - f22;
                                                                    }
                                                                    float f34 = f27;
                                                                    float f35 = f28;
                                                                    int i21 = i10 + 1;
                                                                    int i22 = i10 + 2;
                                                                    int i23 = i10 + 3;
                                                                    path2.cubicTo(f34, f35, fArr[i10], fArr[i21], fArr[i22], fArr[i23]);
                                                                    float f36 = fArr[i10];
                                                                    float f37 = fArr[i21];
                                                                    f21 = f36;
                                                                    f22 = f37;
                                                                    f10 = fArr[i22];
                                                                    f3 = fArr[i23];
                                                                }
                                                            } else {
                                                                fArr = fArr3;
                                                                i10 = i13;
                                                                f10 = fArr[i10];
                                                                f3 = fArr[i10 + 1];
                                                                if (i10 > 0) {
                                                                    path2.lineTo(f10, f3);
                                                                } else {
                                                                    path2.moveTo(f10, f3);
                                                                    f25 = f10;
                                                                    f26 = f3;
                                                                }
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            i10 = i13;
                                                            int i24 = i10 + 1;
                                                            path2.lineTo(fArr[i10], fArr[i24]);
                                                            f10 = fArr[i10];
                                                            f3 = fArr[i24];
                                                        }
                                                        i11 = i12;
                                                        eVar = eVar3;
                                                        c10 = c13;
                                                    } else {
                                                        fArr = fArr3;
                                                        i10 = i13;
                                                        path2.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr[i10]);
                                                        f14 = fArr[i10];
                                                    }
                                                    f28 += f14;
                                                } else {
                                                    fArr = fArr3;
                                                    i10 = i13;
                                                    int i25 = i10 + 1;
                                                    int i26 = i10 + 2;
                                                    int i27 = i10 + 3;
                                                    path2.rQuadTo(fArr[i10], fArr[i25], fArr[i26], fArr[i27]);
                                                    f11 = fArr[i10] + f27;
                                                    f12 = fArr[i25] + f28;
                                                    f27 += fArr[i26];
                                                    f13 = fArr[i27];
                                                }
                                                f28 += f13;
                                                f21 = f11;
                                                f22 = f12;
                                            } else {
                                                fArr = fArr3;
                                                i10 = i13;
                                                path2.rLineTo(fArr[i10], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                f27 += fArr[i10];
                                            }
                                        } else {
                                            fArr = fArr3;
                                            i10 = i13;
                                            int i28 = i10 + 2;
                                            int i29 = i10 + 3;
                                            int i30 = i10 + 4;
                                            int i31 = i10 + 5;
                                            path2.rCubicTo(fArr[i10], fArr[i10 + 1], fArr[i28], fArr[i29], fArr[i30], fArr[i31]);
                                            float f38 = fArr[i28] + f27;
                                            float f39 = fArr[i29] + f28;
                                            f27 += fArr[i30];
                                            f28 += fArr[i31];
                                            f21 = f38;
                                            f22 = f39;
                                        }
                                        eVar = eVar3;
                                        f10 = f27;
                                        f3 = f28;
                                        i11 = i12;
                                        c10 = c13;
                                    } else {
                                        fArr = fArr3;
                                        i10 = i13;
                                        int i32 = i10 + 5;
                                        float f40 = fArr[i32] + f27;
                                        int i33 = i10 + 6;
                                        float f41 = fArr[i33] + f28;
                                        float f42 = fArr[i10];
                                        float f43 = fArr[i10 + 1];
                                        float f44 = fArr[i10 + 2];
                                        if (fArr[i10 + 3] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            eVar2 = eVar3;
                                            z12 = true;
                                        } else {
                                            eVar2 = eVar3;
                                            z12 = false;
                                        }
                                        eVar = eVar2;
                                        float f45 = f27;
                                        c10 = c13;
                                        if (fArr[i10 + 4] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        float f46 = f28;
                                        i11 = i12;
                                        a(path, f45, f46, f40, f41, f42, f43, f44, z12, z13);
                                        f10 = f45 + fArr[i32];
                                        f3 = f46 + fArr[i33];
                                        f21 = f10;
                                        f22 = f3;
                                    }
                                } else {
                                    fArr = fArr3;
                                    i10 = i13;
                                    i11 = i12;
                                    eVar = eVar3;
                                    f10 = f27;
                                    c10 = c13;
                                    path2.lineTo(f10, fArr[i10]);
                                    f3 = fArr[i10];
                                }
                            } else {
                                fArr = fArr3;
                                i10 = i13;
                                i11 = i12;
                                eVar = eVar3;
                                c10 = c13;
                                int i34 = i10 + 1;
                                int i35 = i10 + 2;
                                int i36 = i10 + 3;
                                path2.quadTo(fArr[i10], fArr[i34], fArr[i35], fArr[i36]);
                                float f47 = fArr[i10];
                                float f48 = fArr[i34];
                                float f49 = fArr[i35];
                                float f50 = fArr[i36];
                                f21 = f47;
                                f22 = f48;
                                f10 = f49;
                                f3 = f50;
                            }
                        } else {
                            fArr = fArr3;
                            i10 = i13;
                            eVar = eVar3;
                            c10 = c13;
                            f3 = f28;
                            i11 = i12;
                            path2.lineTo(fArr[i10], f3);
                            f10 = fArr[i10];
                        }
                    } else {
                        fArr = fArr3;
                        i10 = i13;
                        i11 = i12;
                        eVar = eVar3;
                        c10 = c13;
                        int i37 = i10 + 2;
                        int i38 = i10 + 3;
                        int i39 = i10 + 4;
                        int i40 = i10 + 5;
                        path2.cubicTo(fArr[i10], fArr[i10 + 1], fArr[i37], fArr[i38], fArr[i39], fArr[i40]);
                        float f51 = fArr[i39];
                        float f52 = fArr[i40];
                        f21 = fArr[i37];
                        f22 = fArr[i38];
                        f3 = f52;
                        f10 = f51;
                    }
                } else {
                    fArr = fArr3;
                    i10 = i13;
                    eVar = eVar3;
                    float f53 = f27;
                    float f54 = f28;
                    i11 = i12;
                    c10 = c13;
                    int i41 = i10 + 5;
                    float f55 = fArr[i41];
                    int i42 = i10 + 6;
                    float f56 = fArr[i42];
                    float f57 = fArr[i10];
                    float f58 = fArr[i10 + 1];
                    float f59 = fArr[i10 + 2];
                    if (fArr[i10 + 3] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (fArr[i10 + 4] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a(path, f53, f54, f55, f56, f57, f58, f59, z10, z11);
                    f21 = fArr[i41];
                    f3 = fArr[i42];
                    f22 = f3;
                    f10 = f21;
                }
                i13 = i10 + i6;
                path2 = path;
                eVar3 = eVar;
                c13 = c10;
                i12 = i11;
                f27 = f10;
                f28 = f3;
                c12 = c13;
                fArr3 = fArr;
            }
            fArr2[0] = f27;
            fArr2[1] = f28;
            fArr2[2] = f21;
            fArr2[3] = f22;
            fArr2[4] = f25;
            fArr2[5] = f26;
            c12 = eVar3.f8067a;
            i12++;
            eVarArr2 = eVarArr;
            path2 = path;
            c11 = 0;
        }
    }

    public e(e eVar) {
        this.f8067a = eVar.f8067a;
        float[] fArr = eVar.f8068b;
        this.f8068b = a8.i.c(fArr, fArr.length);
    }
}
