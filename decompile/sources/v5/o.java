package v5;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import l7.d0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements e9.c, d0 {

    /* renamed from: y, reason: collision with root package name */
    public static o f13329y;

    /* renamed from: x, reason: collision with root package name */
    public int f13330x;

    public /* synthetic */ o(int i6) {
        this.f13330x = i6;
    }

    public static synchronized o f() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f13329y == null) {
                    f13329y = new o(3);
                }
                oVar = f13329y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // l7.d0
    public Object a(m7.a aVar, float f3) {
        boolean z10;
        int i6;
        float f10;
        int i10;
        int argb;
        float f11;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        if (aVar.f0() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            aVar.d();
        }
        while (aVar.K()) {
            arrayList.add(Float.valueOf((float) aVar.S()));
        }
        int i12 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f13330x = 2;
        }
        if (z10) {
            aVar.l();
        }
        if (this.f13330x == -1) {
            this.f13330x = arrayList.size() / 4;
        }
        int i13 = this.f13330x;
        float[] fArr = new float[i13];
        int[] iArr = new int[i13];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i6 = this.f13330x * 4;
            if (i14 >= i6) {
                break;
            }
            int i17 = i14 / 4;
            double floatValue = ((Float) arrayList.get(i14)).floatValue();
            int i18 = i14 % 4;
            if (i18 != 0) {
                if (i18 != i11) {
                    if (i18 != 2) {
                        if (i18 == 3) {
                            iArr[i17] = Color.argb(255, i15, i16, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i16 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i15 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i17 > 0) {
                    float f12 = (float) floatValue;
                    if (fArr[i17 - 1] >= f12) {
                        fArr[i17] = f12 + 0.01f;
                    }
                }
                fArr[i17] = (float) floatValue;
            }
            i14++;
            i11 = 1;
        }
        i7.c cVar = new i7.c(fArr, iArr);
        if (arrayList.size() <= i6) {
            return cVar;
        }
        int size = (arrayList.size() - i6) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i19 = 0;
        while (i6 < arrayList.size()) {
            if (i6 % 2 == 0) {
                fArr2[i19] = ((Float) arrayList.get(i6)).floatValue();
            } else {
                fArr3[i19] = ((Float) arrayList.get(i6)).floatValue();
                i19++;
            }
            i6++;
        }
        float[] fArr4 = cVar.f6630a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < length; i23++) {
                float f13 = Float.NaN;
                if (i21 < fArr4.length) {
                    f10 = fArr4[i21];
                } else {
                    f10 = Float.NaN;
                }
                if (i22 < size) {
                    f13 = fArr2[i22];
                }
                if (!Float.isNaN(f13) && f10 >= f13) {
                    if (!Float.isNaN(f10) && f13 >= f10) {
                        fArr5[i23] = f10;
                        i21++;
                        i22++;
                        i20++;
                    } else {
                        fArr5[i23] = f13;
                        i22++;
                    }
                } else {
                    fArr5[i23] = f10;
                    i21++;
                }
            }
            if (i20 == 0) {
                fArr4 = fArr5;
            } else {
                fArr4 = Arrays.copyOf(fArr5, length - i20);
            }
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i24 = 0;
        while (i24 < length2) {
            float f14 = fArr4[i24];
            int binarySearch = Arrays.binarySearch(fArr, f14);
            int binarySearch2 = Arrays.binarySearch(fArr2, f14);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                int i25 = iArr[binarySearch];
                if (size >= i12 && f14 > fArr2[0]) {
                    for (int i26 = 1; i26 < size; i26++) {
                        float f15 = fArr2[i26];
                        if (f15 >= f14 || i26 == size - 1) {
                            if (f15 <= f14) {
                                f11 = fArr3[i26];
                            } else {
                                int i27 = i26 - 1;
                                float f16 = fArr2[i27];
                                f11 = n7.g.f(fArr3[i27], fArr3[i26], (f14 - f16) / (f15 - f16));
                            }
                            argb = Color.argb((int) (f11 * 255.0f), Color.red(i25), Color.green(i25), Color.blue(i25));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                argb = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i25), Color.green(i25), Color.blue(i25));
                iArr2[i24] = argb;
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f17 = fArr3[binarySearch2];
                if (i13 >= 2 && f14 != fArr[0]) {
                    for (int i28 = 1; i28 < i13; i28++) {
                        float f18 = fArr[i28];
                        if (f18 >= f14 || i28 == i13 - 1) {
                            if (i28 == i13 - 1 && f14 >= f18) {
                                i10 = Color.argb((int) (f17 * 255.0f), Color.red(iArr[i28]), Color.green(iArr[i28]), Color.blue(iArr[i28]));
                            } else {
                                int i29 = i28 - 1;
                                float f19 = fArr[i29];
                                int i30 = a8.g.i((f14 - f19) / (f18 - f19), iArr[i29], iArr[i28]);
                                i10 = Color.argb((int) (f17 * 255.0f), Color.red(i30), Color.green(i30), Color.blue(i30));
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                i10 = iArr[0];
                iArr2[i24] = i10;
            }
            i24++;
            i12 = 2;
        }
        return new i7.c(fArr4, iArr2);
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f13330x <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public synchronized void c() {
        this.f13330x++;
    }

    @Override // e9.c
    public int d(Context context, String str, boolean z10) {
        return 0;
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f13330x <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void g(String str, String str2, Throwable... thArr) {
        if (this.f13330x <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void i(String str, String str2, Throwable... thArr) {
        if (this.f13330x <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // e9.c
    public int m(Context context, String str) {
        return this.f13330x;
    }

    public o() {
        this.f13330x = 0;
    }
}
