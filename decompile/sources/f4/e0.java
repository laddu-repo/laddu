package f4;

import a2.e2;
import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 implements b0 {
    public final Cloneable A;
    public final Object B;

    /* renamed from: x, reason: collision with root package name */
    public final int f4763x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4764y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f4765z;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f4763x = glCreateProgram;
        u1.a.c();
        c(str, glCreateProgram, 35633);
        c(str2, glCreateProgram, 35632);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        u1.a.d("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.A = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f4764y = new ob.a[iArr2[0]];
        for (int i6 = 0; i6 < iArr2[0]; i6++) {
            int i10 = this.f4763x;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr3, 0);
            int i11 = iArr3[0];
            byte[] bArr = new byte[i11];
            GLES20.glGetActiveAttrib(i10, i6, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                if (bArr[i12] == 0) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            String str3 = new String(bArr, 0, i11);
            GLES20.glGetAttribLocation(i10, str3);
            Object obj = new Object();
            ((ob.a[]) this.f4764y)[i6] = obj;
            ((HashMap) this.A).put(str3, obj);
        }
        this.B = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f4763x, 35718, iArr4, 0);
        this.f4765z = new p.l[iArr4[0]];
        for (int i13 = 0; i13 < iArr4[0]; i13++) {
            int i14 = this.f4763x;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i14, 35719, iArr5, 0);
            int i15 = iArr5[0];
            byte[] bArr2 = new byte[i15];
            GLES20.glGetActiveUniform(i14, i13, i15, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i16 = 0;
            while (true) {
                if (i16 >= i15) {
                    break;
                }
                if (bArr2[i16] == 0) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            String str4 = new String(bArr2, 0, i15);
            GLES20.glGetUniformLocation(i14, str4);
            Object obj2 = new Object();
            ((p.l[]) this.f4765z)[i13] = obj2;
            ((HashMap) this.B).put(str4, obj2);
        }
        u1.a.c();
    }

    public static void c(String str, int i6, int i10) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z10 = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z10 = true;
        }
        u1.a.d(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, z10);
        GLES20.glAttachShader(i6, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        u1.a.c();
    }

    @Override // f4.b0
    public void a(u1.t tVar) {
        u1.y yVar;
        int i6;
        u1.y yVar2;
        SparseArray sparseArray;
        int i10;
        u1.s sVar;
        int i11;
        i0 a10;
        int i12;
        int i13;
        u1.y yVar3;
        SparseArray sparseArray2 = (SparseArray) this.f4765z;
        SparseIntArray sparseIntArray = (SparseIntArray) this.A;
        u1.s sVar2 = (u1.s) this.f4764y;
        f0 f0Var = (f0) this.B;
        SparseArray sparseArray3 = f0Var.f4775h;
        SparseBooleanArray sparseBooleanArray = f0Var.f4776i;
        f fVar = f0Var.f4773f;
        List list = f0Var.f4770c;
        int i14 = f0Var.f4768a;
        if (tVar.y() == 2) {
            if (i14 != 1 && i14 != 2 && f0Var.f4780n != 1) {
                yVar = new u1.y(((u1.y) list.get(0)).d());
                list.add(yVar);
            } else {
                yVar = (u1.y) list.get(0);
            }
            if ((tVar.y() & 128) != 0) {
                tVar.L(1);
                int E = tVar.E();
                tVar.L(3);
                tVar.i(sVar2.f12804b, 0, 2);
                sVar2.q(0);
                sVar2.t(3);
                f0Var.f4785t = sVar2.i(13);
                tVar.i(sVar2.f12804b, 0, 2);
                sVar2.q(0);
                sVar2.t(4);
                tVar.L(sVar2.i(12));
                if (i14 == 2 && f0Var.f4784r == null) {
                    i0 a11 = fVar.a(21, new s8.n(21, null, 0, null, u1.a0.f12751b));
                    f0Var.f4784r = a11;
                    if (a11 != null) {
                        a11.b(yVar, f0Var.f4779m, new h0(E, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a12 = tVar.a();
                while (a12 > 0) {
                    tVar.i(sVar2.f12804b, 0, 5);
                    sVar2.q(0);
                    int i15 = sVar2.i(8);
                    sVar2.t(3);
                    int i16 = sVar2.i(13);
                    sVar2.t(4);
                    int i17 = sVar2.i(12);
                    int i18 = tVar.f12812b;
                    int i19 = i18 + i17;
                    int i20 = a12;
                    String str = null;
                    ArrayList arrayList = null;
                    int i21 = -1;
                    int i22 = 0;
                    while (true) {
                        if (tVar.f12812b < i19) {
                            int y9 = tVar.y();
                            sVar = sVar2;
                            int y10 = tVar.f12812b + tVar.y();
                            if (y10 > i19) {
                                break;
                            }
                            SparseArray sparseArray4 = sparseArray3;
                            if (y9 == 5) {
                                long A = tVar.A();
                                if (A == 1094921523) {
                                    i21 = 129;
                                } else if (A == 1161904947) {
                                    i21 = 135;
                                } else {
                                    if (A != 1094921524) {
                                        if (A == 1212503619) {
                                            i21 = 36;
                                        }
                                    }
                                    i21 = 172;
                                }
                                i12 = y10;
                                i13 = E;
                                yVar3 = yVar;
                            } else if (y9 == 106) {
                                i12 = y10;
                                i13 = E;
                                yVar3 = yVar;
                                i21 = 129;
                            } else if (y9 == 122) {
                                i12 = y10;
                                i13 = E;
                                yVar3 = yVar;
                                i21 = 135;
                            } else if (y9 == 127) {
                                int y11 = tVar.y();
                                if (y11 != 21) {
                                    if (y11 == 14) {
                                        i21 = 136;
                                    } else if (y11 == 33) {
                                        i21 = 139;
                                    }
                                    i12 = y10;
                                    i13 = E;
                                    yVar3 = yVar;
                                }
                                i21 = 172;
                                i12 = y10;
                                i13 = E;
                                yVar3 = yVar;
                            } else if (y9 == 123) {
                                i12 = y10;
                                i13 = E;
                                yVar3 = yVar;
                                i21 = 138;
                            } else if (y9 == 10) {
                                str = tVar.w(3, StandardCharsets.UTF_8).trim();
                                i12 = y10;
                                i22 = tVar.y();
                                i13 = E;
                                yVar3 = yVar;
                            } else if (y9 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (tVar.f12812b < y10) {
                                    String trim = tVar.w(3, StandardCharsets.UTF_8).trim();
                                    tVar.y();
                                    u1.y yVar4 = yVar;
                                    byte[] bArr = new byte[4];
                                    tVar.i(bArr, 0, 4);
                                    arrayList2.add(new g0(trim, bArr));
                                    yVar = yVar4;
                                    y10 = y10;
                                    E = E;
                                }
                                i12 = y10;
                                i13 = E;
                                yVar3 = yVar;
                                arrayList = arrayList2;
                                i21 = 89;
                            } else {
                                i12 = y10;
                                i13 = E;
                                yVar3 = yVar;
                                if (y9 == 111) {
                                    i21 = 257;
                                }
                            }
                            tVar.L(i12 - tVar.f12812b);
                            yVar = yVar3;
                            sVar2 = sVar;
                            sparseArray3 = sparseArray4;
                            E = i13;
                        } else {
                            sVar = sVar2;
                            break;
                        }
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i23 = E;
                    u1.y yVar5 = yVar;
                    tVar.K(i19);
                    s8.n nVar = new s8.n(i21, str, i22, arrayList, Arrays.copyOfRange(tVar.f12811a, i18, i19));
                    if (i15 == 6 || i15 == 5) {
                        i15 = i21;
                    }
                    int i24 = i20 - (i17 + 5);
                    if (i14 == 2) {
                        i11 = i15;
                    } else {
                        i11 = i16;
                    }
                    if (!sparseBooleanArray.get(i11)) {
                        if (i14 == 2 && i15 == 21) {
                            a10 = f0Var.f4784r;
                        } else {
                            a10 = fVar.a(i15, nVar);
                        }
                        if (i14 != 2 || i16 < sparseIntArray.get(i11, 8192)) {
                            sparseIntArray.put(i11, i16);
                            sparseArray2.put(i11, a10);
                        }
                    }
                    a12 = i24;
                    yVar = yVar5;
                    sVar2 = sVar;
                    sparseArray3 = sparseArray5;
                    E = i23;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i25 = E;
                u1.y yVar6 = yVar;
                int size = sparseIntArray.size();
                int i26 = 0;
                while (i26 < size) {
                    int keyAt = sparseIntArray.keyAt(i26);
                    int valueAt = sparseIntArray.valueAt(i26);
                    sparseBooleanArray.put(keyAt, true);
                    f0Var.j.put(valueAt, true);
                    i0 i0Var = (i0) sparseArray2.valueAt(i26);
                    if (i0Var != null) {
                        if (i0Var != f0Var.f4784r) {
                            i10 = i25;
                            yVar2 = yVar6;
                            i0Var.b(yVar2, f0Var.f4779m, new h0(i10, keyAt, 8192));
                        } else {
                            yVar2 = yVar6;
                            i10 = i25;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, i0Var);
                    } else {
                        yVar2 = yVar6;
                        sparseArray = sparseArray6;
                        i10 = i25;
                    }
                    i26++;
                    sparseArray6 = sparseArray;
                    i25 = i10;
                    yVar6 = yVar2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i14 == 2) {
                    if (!f0Var.f4781o) {
                        f0Var.f4779m.t();
                        f0Var.f4780n = 0;
                        f0Var.f4781o = true;
                        return;
                    }
                    return;
                }
                sparseArray7.remove(this.f4763x);
                if (i14 == 1) {
                    i6 = 0;
                } else {
                    i6 = f0Var.f4780n - 1;
                }
                f0Var.f4780n = i6;
                if (i6 == 0) {
                    f0Var.f4779m.t();
                    f0Var.f4781o = true;
                }
            }
        }
    }

    public int d(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f4763x, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        u1.a.c();
        return glGetAttribLocation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(y2.x xVar, v9.b bVar, byte[] bArr, e2[] e2VarArr, int i6) {
        this.f4764y = xVar;
        this.f4765z = bVar;
        this.A = bArr;
        this.B = e2VarArr;
        this.f4763x = i6;
    }

    public e0(f0 f0Var, int i6) {
        this.B = f0Var;
        this.f4764y = new u1.s(5, new byte[5]);
        this.f4765z = new SparseArray();
        this.A = new SparseIntArray();
        this.f4763x = i6;
    }

    @Override // f4.b0
    public void b(u1.y yVar, y2.q qVar, h0 h0Var) {
    }
}
