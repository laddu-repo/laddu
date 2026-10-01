package u3;

import android.text.SpannableStringBuilder;
import ef.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f12872h = new t();
    public final f i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12873j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e[] f12875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f12876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f12877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f12878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f12879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12880q;

    public g(int i, List list) {
        this.f12874k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = w1.c.f13697a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b9 = ((byte[]) list.get(0))[0];
            }
        }
        this.f12875l = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f12875l[i10] = new e();
        }
        this.f12876m = this.f12875l[0];
    }

    @Override // u3.j
    public final l b() {
        List list = this.f12877n;
        this.f12878o = list;
        list.getClass();
        return new l(list);
    }

    @Override // u3.j
    public final void c(h hVar) {
        ByteBuffer byteBuffer = hVar.data;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        t tVar = this.f12872h;
        tVar.H(iLimit, bArrArray);
        while (tVar.a() >= 3) {
            int iX = tVar.x();
            int i = iX & 3;
            boolean z2 = (iX & 4) == 4;
            byte bX = (byte) tVar.x();
            byte bX2 = (byte) tVar.x();
            if (i == 2 || i == 3) {
                if (z2) {
                    if (i == 3) {
                        f();
                        int i10 = (bX & 192) >> 6;
                        int i11 = this.f12873j;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            h();
                            w1.a.C("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f12873j + " current=" + i10);
                        }
                        this.f12873j = i10;
                        int i12 = bX & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        f fVar = new f(i10, i12);
                        this.f12879p = fVar;
                        byte[] bArr = fVar.f12868b;
                        fVar.f12871e = 1;
                        bArr[0] = bX2;
                    } else {
                        w1.a.d(i == 2);
                        f fVar2 = this.f12879p;
                        if (fVar2 == null) {
                            w1.a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = fVar2.f12868b;
                            int i13 = fVar2.f12871e;
                            int i14 = i13 + 1;
                            fVar2.f12871e = i14;
                            bArr2[i13] = bX;
                            fVar2.f12871e = i13 + 2;
                            bArr2[i14] = bX2;
                        }
                    }
                    f fVar3 = this.f12879p;
                    if (fVar3.f12871e == (fVar3.f12870d * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override // u3.j
    public final boolean e() {
        return this.f12877n != this.f12878o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f() {
        char c10;
        int i;
        boolean z2;
        f fVar = this.f12879p;
        if (fVar == null) {
            return;
        }
        int i10 = 2;
        if (fVar.f12871e != (fVar.f12870d * 2) - 1) {
            w1.a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f12879p.f12870d * 2) - 1) + ", but current index is " + this.f12879p.f12871e + " (sequence number " + this.f12879p.f12869c + ");");
        }
        f fVar2 = this.f12879p;
        byte[] bArr = fVar2.f12868b;
        int i11 = fVar2.f12871e;
        f fVar3 = this.i;
        fVar3.o(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (fVar3.b() > 0) {
                int i12 = 3;
                int i13 = fVar3.i(3);
                int i14 = fVar3.i(5);
                if (i13 == 7) {
                    fVar3.t(i10);
                    i13 = fVar3.i(6);
                    if (i13 < 7) {
                        u5.a.d(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        w1.a.C("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f12874k) {
                    fVar3.u(i14);
                } else {
                    int iG = (i14 * 8) + fVar3.g();
                    while (fVar3.g() < iG) {
                        int i15 = fVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 == i12) {
                                        this.f12877n = g();
                                    } else if (i15 != 8) {
                                        switch (i15) {
                                            case 12:
                                                h();
                                                break;
                                            case 13:
                                                this.f12876m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i15 >= 17 && i15 <= 23) {
                                                    w1.a.C("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                    fVar3.t(8);
                                                } else if (i15 < 24 || i15 > 31) {
                                                    u5.a.d(i15, "Invalid C0 command: ", "Cea708Decoder");
                                                } else {
                                                    w1.a.C("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                    fVar3.t(16);
                                                }
                                                break;
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f12876m.f12849b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i10;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f12876m.a((char) 9835);
                                } else {
                                    this.f12876m.a((char) (i15 & 255));
                                }
                                i = i10;
                                z10 = true;
                            } else {
                                if (i15 <= 159) {
                                    e[] eVarArr = this.f12875l;
                                    switch (i15) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z2 = true;
                                            int i16 = i15 - 128;
                                            if (this.f12880q != i16) {
                                                this.f12880q = i16;
                                                this.f12876m = eVarArr[i16];
                                            }
                                            break;
                                        case 136:
                                            z2 = true;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (fVar3.h()) {
                                                    e eVar = eVarArr[8 - i17];
                                                    eVar.f12848a.clear();
                                                    eVar.f12849b.clear();
                                                    eVar.f12860o = -1;
                                                    eVar.f12861p = -1;
                                                    eVar.f12862q = -1;
                                                    eVar.f12864s = -1;
                                                    eVar.f12866u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i18].f12851d = true;
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 138:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i19].f12851d = false;
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 139:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i20].f12851d = !r1.f12851d;
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 140:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i21].d();
                                                }
                                            }
                                            z2 = true;
                                            break;
                                        case 141:
                                            fVar3.t(8);
                                            z2 = true;
                                            break;
                                        case 142:
                                            z2 = true;
                                            break;
                                        case 143:
                                            h();
                                            z2 = true;
                                            break;
                                        case 144:
                                            int i22 = i10;
                                            if (this.f12876m.f12850c) {
                                                fVar3.i(4);
                                                fVar3.i(i22);
                                                fVar3.i(i22);
                                                boolean zH = fVar3.h();
                                                boolean zH2 = fVar3.h();
                                                i12 = 3;
                                                fVar3.i(3);
                                                fVar3.i(3);
                                                this.f12876m.e(zH, zH2);
                                                z2 = true;
                                            } else {
                                                fVar3.t(16);
                                                z2 = true;
                                                i12 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.f12876m.f12850c) {
                                                int iC = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                int iC2 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                fVar3.t(2);
                                                e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), 0);
                                                this.f12876m.f(iC, iC2);
                                            } else {
                                                fVar3.t(24);
                                            }
                                            z2 = true;
                                            i12 = 3;
                                            break;
                                        case 146:
                                            if (this.f12876m.f12850c) {
                                                fVar3.t(4);
                                                int i23 = fVar3.i(4);
                                                fVar3.t(2);
                                                fVar3.i(6);
                                                e eVar2 = this.f12876m;
                                                if (eVar2.f12866u != i23) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f12866u = i23;
                                            } else {
                                                fVar3.t(16);
                                            }
                                            z2 = true;
                                            i12 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            u5.a.d(i15, "Invalid C1 command: ", "Cea708Decoder");
                                            z2 = true;
                                            break;
                                        case 151:
                                            if (this.f12876m.f12850c) {
                                                int iC3 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                fVar3.i(2);
                                                e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), 0);
                                                fVar3.h();
                                                fVar3.h();
                                                fVar3.i(2);
                                                fVar3.i(2);
                                                int i24 = fVar3.i(2);
                                                fVar3.t(8);
                                                e eVar3 = this.f12876m;
                                                eVar3.f12859n = iC3;
                                                eVar3.f12856k = i24;
                                            } else {
                                                fVar3.t(32);
                                            }
                                            z2 = true;
                                            i12 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i25 = i15 - 152;
                                            e eVar4 = eVarArr[i25];
                                            fVar3.t(i10);
                                            boolean zH3 = fVar3.h();
                                            fVar3.t(i10);
                                            int i26 = fVar3.i(i12);
                                            boolean zH4 = fVar3.h();
                                            int i27 = fVar3.i(7);
                                            int i28 = fVar3.i(8);
                                            int i29 = fVar3.i(4);
                                            int i30 = fVar3.i(4);
                                            fVar3.t(i10);
                                            fVar3.t(6);
                                            fVar3.t(i10);
                                            int i31 = fVar3.i(3);
                                            int i32 = fVar3.i(3);
                                            ArrayList arrayList = eVar4.f12848a;
                                            eVar4.f12850c = true;
                                            eVar4.f12851d = zH3;
                                            eVar4.f12852e = i26;
                                            eVar4.f = zH4;
                                            eVar4.f12853g = i27;
                                            eVar4.f12854h = i28;
                                            eVar4.i = i29;
                                            int i33 = i30 + 1;
                                            if (eVar4.f12855j != i33) {
                                                eVar4.f12855j = i33;
                                                while (true) {
                                                    if (arrayList.size() >= eVar4.f12855j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i31 != 0 && eVar4.f12857l != i31) {
                                                eVar4.f12857l = i31;
                                                int i34 = i31 - 1;
                                                int i35 = e.B[i34];
                                                boolean z11 = e.A[i34];
                                                int i36 = e.f12846y[i34];
                                                int i37 = e.f12847z[i34];
                                                int i38 = e.f12845x[i34];
                                                eVar4.f12859n = i35;
                                                eVar4.f12856k = i38;
                                            }
                                            if (i32 != 0 && eVar4.f12858m != i32) {
                                                eVar4.f12858m = i32;
                                                int i39 = i32 - 1;
                                                int i40 = e.D[i39];
                                                int i41 = e.C[i39];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f12843v, e.E[i39]);
                                            }
                                            if (this.f12880q != i25) {
                                                this.f12880q = i25;
                                                this.f12876m = eVarArr[i25];
                                            }
                                            z2 = true;
                                            i12 = 3;
                                            break;
                                    }
                                } else {
                                    z2 = true;
                                    if (i15 <= 255) {
                                        this.f12876m.a((char) (i15 & 255));
                                    } else {
                                        u5.a.d(i15, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c10 = 7;
                                    }
                                }
                                z10 = z2;
                                i = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                        } else {
                            int i42 = fVar3.i(8);
                            if (i42 <= 31) {
                                c10 = 7;
                                if (i42 > 7) {
                                    if (i42 <= 15) {
                                        fVar3.t(8);
                                    } else if (i42 <= 23) {
                                        fVar3.t(16);
                                    } else if (i42 <= 31) {
                                        fVar3.t(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (i42 <= 127) {
                                    if (i42 == 32) {
                                        this.f12876m.a(' ');
                                    } else if (i42 == 33) {
                                        this.f12876m.a((char) 160);
                                    } else if (i42 == 37) {
                                        this.f12876m.a((char) 8230);
                                    } else if (i42 == 42) {
                                        this.f12876m.a((char) 352);
                                    } else if (i42 == 44) {
                                        this.f12876m.a((char) 338);
                                    } else if (i42 == 63) {
                                        this.f12876m.a((char) 376);
                                    } else if (i42 == 57) {
                                        this.f12876m.a((char) 8482);
                                    } else if (i42 == 58) {
                                        this.f12876m.a((char) 353);
                                    } else if (i42 == 60) {
                                        this.f12876m.a((char) 339);
                                    } else if (i42 != 61) {
                                        switch (i42) {
                                            case 48:
                                                this.f12876m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f12876m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f12876m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f12876m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f12876m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f12876m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i42) {
                                                    case 118:
                                                        this.f12876m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f12876m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f12876m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f12876m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f12876m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f12876m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f12876m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f12876m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f12876m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f12876m.a((char) 9484);
                                                        break;
                                                    default:
                                                        u5.a.d(i42, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.f12876m.a((char) 8480);
                                    }
                                    i = 2;
                                    z10 = true;
                                } else if (i42 > 159) {
                                    i = 2;
                                    if (i42 <= 255) {
                                        if (i42 == 160) {
                                            this.f12876m.a((char) 13252);
                                        } else {
                                            u5.a.d(i42, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f12876m.a('_');
                                        }
                                        z10 = true;
                                    } else {
                                        u5.a.d(i42, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i42 <= 135) {
                                    fVar3.t(32);
                                } else if (i42 <= 143) {
                                    fVar3.t(40);
                                } else if (i42 <= 159) {
                                    i = 2;
                                    fVar3.t(2);
                                    fVar3.t(fVar3.i(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i10 = i;
                    }
                }
            }
        }
        if (z10) {
            this.f12877n = g();
        }
        this.f12879p = null;
    }

    @Override // u3.j, a2.e
    public final void flush() {
        super.flush();
        this.f12877n = null;
        this.f12878o = null;
        this.f12880q = 0;
        this.f12876m = this.f12875l[0];
        h();
        this.f12879p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List g() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.g.g():java.util.List");
    }

    public final void h() {
        for (int i = 0; i < 8; i++) {
            this.f12875l[i].d();
        }
    }
}
