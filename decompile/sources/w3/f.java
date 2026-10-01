package w3;

import a2.a2;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import u1.s;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: h, reason: collision with root package name */
    public final t f13782h = new t();

    /* renamed from: i, reason: collision with root package name */
    public final s f13783i = new s();
    public int j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final int f13784k;

    /* renamed from: l, reason: collision with root package name */
    public final e[] f13785l;

    /* renamed from: m, reason: collision with root package name */
    public e f13786m;

    /* renamed from: n, reason: collision with root package name */
    public List f13787n;

    /* renamed from: o, reason: collision with root package name */
    public List f13788o;

    /* renamed from: p, reason: collision with root package name */
    public s f13789p;

    /* renamed from: q, reason: collision with root package name */
    public int f13790q;

    public f(int i6, List list) {
        this.f13784k = i6 == -1 ? 1 : i6;
        if (list != null) {
            byte[] bArr = u1.d.f12764a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.f13785l = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f13785l[i10] = new e();
        }
        this.f13786m = this.f13785l[0];
    }

    @Override // w3.i, y1.e
    public final void flush() {
        super.flush();
        this.f13787n = null;
        this.f13788o = null;
        this.f13790q = 0;
        this.f13786m = this.f13785l[0];
        m();
        this.f13789p = null;
    }

    @Override // w3.i
    public final a2 g() {
        List list = this.f13787n;
        this.f13788o = list;
        list.getClass();
        return new a2(list, 28);
    }

    @Override // y1.e
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // w3.i
    public final void h(g gVar) {
        boolean z10;
        ByteBuffer byteBuffer = gVar.f14812z;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t tVar = this.f13782h;
        tVar.I(limit, array);
        while (tVar.a() >= 3) {
            int y9 = tVar.y();
            int i6 = y9 & 3;
            boolean z11 = false;
            if ((y9 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte y10 = (byte) tVar.y();
            byte y11 = (byte) tVar.y();
            if (i6 == 2 || i6 == 3) {
                if (z10) {
                    if (i6 == 3) {
                        k();
                        int i10 = (y10 & 192) >> 6;
                        int i11 = this.j;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            m();
                            u1.a.p("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i10);
                        }
                        this.j = i10;
                        int i12 = y10 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        s sVar = new s(i10, i12);
                        this.f13789p = sVar;
                        byte[] bArr = sVar.f12804b;
                        sVar.f12807e = 1;
                        bArr[0] = y11;
                    } else {
                        if (i6 == 2) {
                            z11 = true;
                        }
                        u1.c.b(z11);
                        s sVar2 = this.f13789p;
                        if (sVar2 == null) {
                            u1.a.g("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = sVar2.f12804b;
                            int i13 = sVar2.f12807e;
                            int i14 = i13 + 1;
                            sVar2.f12807e = i14;
                            bArr2[i13] = y10;
                            sVar2.f12807e = i13 + 2;
                            bArr2[i14] = y11;
                        }
                    }
                    s sVar3 = this.f13789p;
                    if (sVar3.f12807e == (sVar3.f12806d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // w3.i
    public final boolean j() {
        if (this.f13787n != this.f13788o) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0145. Please report as an issue. */
    public final void k() {
        s sVar = this.f13789p;
        if (sVar == null) {
            return;
        }
        int i6 = 2;
        if (sVar.f12807e != (sVar.f12806d * 2) - 1) {
            u1.a.f("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f13789p.f12806d * 2) - 1) + ", but current index is " + this.f13789p.f12807e + " (sequence number " + this.f13789p.f12805c + ");");
        }
        s sVar2 = this.f13789p;
        byte[] bArr = sVar2.f12804b;
        int i10 = sVar2.f12807e;
        s sVar3 = this.f13783i;
        sVar3.o(i10, bArr);
        boolean z10 = false;
        while (true) {
            if (sVar3.b() > 0) {
                int i11 = 3;
                int i12 = sVar3.i(3);
                int i13 = sVar3.i(5);
                if (i12 == 7) {
                    sVar3.t(i6);
                    i12 = sVar3.i(6);
                    if (i12 < 7) {
                        h8.c.p(i12, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i13 == 0) {
                    if (i12 != 0) {
                        u1.a.p("Cea708Decoder", "serviceNumber is non-zero (" + i12 + ") when blockSize is 0");
                    }
                } else if (i12 != this.f13784k) {
                    sVar3.u(i13);
                } else {
                    int g10 = (i13 * 8) + sVar3.g();
                    while (sVar3.g() < g10) {
                        int i14 = sVar3.i(8);
                        if (i14 != 16) {
                            if (i14 <= 31) {
                                if (i14 != 0) {
                                    if (i14 != i11) {
                                        if (i14 != 8) {
                                            switch (i14) {
                                                case 12:
                                                    m();
                                                    break;
                                                case 13:
                                                    this.f13786m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i14 >= 17 && i14 <= 23) {
                                                        u1.a.p("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i14);
                                                        sVar3.t(8);
                                                        break;
                                                    } else if (i14 >= 24 && i14 <= 31) {
                                                        u1.a.p("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i14);
                                                        sVar3.t(16);
                                                        break;
                                                    } else {
                                                        h8.c.p(i14, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f13786m.f13764b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f13787n = l();
                                    }
                                }
                            } else if (i14 <= 127) {
                                if (i14 == 127) {
                                    this.f13786m.a((char) 9835);
                                } else {
                                    this.f13786m.a((char) (i14 & 255));
                                }
                                z10 = true;
                            } else {
                                if (i14 <= 159) {
                                    e[] eVarArr = this.f13785l;
                                    switch (i14) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i15 = i14 - 128;
                                            if (this.f13790q != i15) {
                                                this.f13790q = i15;
                                                this.f13786m = eVarArr[i15];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (sVar3.h()) {
                                                    e eVar = eVarArr[8 - i16];
                                                    eVar.f13763a.clear();
                                                    eVar.f13764b.clear();
                                                    eVar.f13776o = -1;
                                                    eVar.f13777p = -1;
                                                    eVar.f13778q = -1;
                                                    eVar.s = -1;
                                                    eVar.f13781u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (sVar3.h()) {
                                                    eVarArr[8 - i17].f13766d = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (sVar3.h()) {
                                                    eVarArr[8 - i18].f13766d = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (sVar3.h()) {
                                                    eVarArr[8 - i19].f13766d = !r1.f13766d;
                                                }
                                            }
                                            break;
                                        case 140:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (sVar3.h()) {
                                                    eVarArr[8 - i20].d();
                                                }
                                            }
                                            break;
                                        case 141:
                                            sVar3.t(8);
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            m();
                                            break;
                                        case 144:
                                            if (!this.f13786m.f13765c) {
                                                sVar3.t(16);
                                                i11 = 3;
                                                break;
                                            } else {
                                                sVar3.i(4);
                                                sVar3.i(2);
                                                sVar3.i(2);
                                                boolean h4 = sVar3.h();
                                                boolean h10 = sVar3.h();
                                                i11 = 3;
                                                sVar3.i(3);
                                                sVar3.i(3);
                                                this.f13786m.e(h4, h10);
                                            }
                                        case 145:
                                            if (!this.f13786m.f13765c) {
                                                sVar3.t(24);
                                            } else {
                                                int c10 = e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                int c11 = e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                sVar3.t(2);
                                                e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), 0);
                                                this.f13786m.f(c10, c11);
                                            }
                                            i11 = 3;
                                            break;
                                        case 146:
                                            if (!this.f13786m.f13765c) {
                                                sVar3.t(16);
                                            } else {
                                                sVar3.t(4);
                                                int i21 = sVar3.i(4);
                                                sVar3.t(2);
                                                sVar3.i(6);
                                                e eVar2 = this.f13786m;
                                                if (eVar2.f13781u != i21) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f13781u = i21;
                                            }
                                            i11 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            h8.c.p(i14, "Invalid C1 command: ", "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (!this.f13786m.f13765c) {
                                                sVar3.t(32);
                                            } else {
                                                int c12 = e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                sVar3.i(2);
                                                e.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), 0);
                                                sVar3.h();
                                                sVar3.h();
                                                sVar3.i(2);
                                                sVar3.i(2);
                                                int i22 = sVar3.i(2);
                                                sVar3.t(8);
                                                e eVar3 = this.f13786m;
                                                eVar3.f13775n = c12;
                                                eVar3.f13772k = i22;
                                            }
                                            i11 = 3;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 152 */:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i23 = i14 - 152;
                                            e eVar4 = eVarArr[i23];
                                            sVar3.t(i6);
                                            boolean h11 = sVar3.h();
                                            sVar3.t(i6);
                                            int i24 = sVar3.i(i11);
                                            boolean h12 = sVar3.h();
                                            int i25 = sVar3.i(7);
                                            int i26 = sVar3.i(8);
                                            int i27 = sVar3.i(4);
                                            int i28 = sVar3.i(4);
                                            sVar3.t(i6);
                                            sVar3.t(6);
                                            sVar3.t(i6);
                                            int i29 = sVar3.i(3);
                                            int i30 = sVar3.i(3);
                                            ArrayList arrayList = eVar4.f13763a;
                                            eVar4.f13765c = true;
                                            eVar4.f13766d = h11;
                                            eVar4.f13767e = i24;
                                            eVar4.f13768f = h12;
                                            eVar4.f13769g = i25;
                                            eVar4.f13770h = i26;
                                            eVar4.f13771i = i27;
                                            int i31 = i28 + 1;
                                            if (eVar4.j != i31) {
                                                eVar4.j = i31;
                                                while (true) {
                                                    if (arrayList.size() >= eVar4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i29 != 0 && eVar4.f13773l != i29) {
                                                eVar4.f13773l = i29;
                                                int i32 = i29 - 1;
                                                int i33 = e.B[i32];
                                                boolean z11 = e.A[i32];
                                                int i34 = e.f13761y[i32];
                                                int i35 = e.f13762z[i32];
                                                int i36 = e.f13760x[i32];
                                                eVar4.f13775n = i33;
                                                eVar4.f13772k = i36;
                                            }
                                            if (i30 != 0 && eVar4.f13774m != i30) {
                                                eVar4.f13774m = i30;
                                                int i37 = i30 - 1;
                                                int i38 = e.D[i37];
                                                int i39 = e.C[i37];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f13758v, e.E[i37]);
                                            }
                                            if (this.f13790q != i23) {
                                                this.f13790q = i23;
                                                this.f13786m = eVarArr[i23];
                                            }
                                            i11 = 3;
                                            break;
                                    }
                                } else if (i14 <= 255) {
                                    this.f13786m.a((char) (i14 & 255));
                                } else {
                                    h8.c.p(i14, "Invalid base command: ", "Cea708Decoder");
                                }
                                z10 = true;
                            }
                        } else {
                            int i40 = sVar3.i(8);
                            if (i40 <= 31) {
                                if (i40 > 7) {
                                    if (i40 <= 15) {
                                        sVar3.t(8);
                                    } else if (i40 <= 23) {
                                        sVar3.t(16);
                                    } else if (i40 <= 31) {
                                        sVar3.t(24);
                                    }
                                }
                            } else if (i40 <= 127) {
                                if (i40 != 32) {
                                    if (i40 != 33) {
                                        if (i40 != 37) {
                                            if (i40 != 42) {
                                                if (i40 != 44) {
                                                    if (i40 != 63) {
                                                        if (i40 != 57) {
                                                            if (i40 != 58) {
                                                                if (i40 != 60) {
                                                                    if (i40 != 61) {
                                                                        switch (i40) {
                                                                            case 48:
                                                                                this.f13786m.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f13786m.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.f13786m.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.f13786m.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.f13786m.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.f13786m.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (i40) {
                                                                                    case 118:
                                                                                        this.f13786m.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f13786m.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f13786m.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f13786m.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f13786m.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f13786m.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f13786m.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f13786m.a((char) 9472);
                                                                                        break;
                                                                                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                                                                        this.f13786m.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.f13786m.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        h8.c.p(i40, "Invalid G2 character: ", "Cea708Decoder");
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f13786m.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f13786m.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f13786m.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f13786m.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.f13786m.a((char) 376);
                                                    }
                                                } else {
                                                    this.f13786m.a((char) 338);
                                                }
                                            } else {
                                                this.f13786m.a((char) 352);
                                            }
                                        } else {
                                            this.f13786m.a((char) 8230);
                                        }
                                    } else {
                                        this.f13786m.a((char) 160);
                                    }
                                } else {
                                    this.f13786m.a(' ');
                                }
                                z10 = true;
                            } else if (i40 <= 159) {
                                if (i40 <= 135) {
                                    sVar3.t(32);
                                } else if (i40 <= 143) {
                                    sVar3.t(40);
                                } else if (i40 <= 159) {
                                    sVar3.t(2);
                                    sVar3.t(sVar3.i(6) * 8);
                                }
                            } else if (i40 <= 255) {
                                if (i40 == 160) {
                                    this.f13786m.a((char) 13252);
                                } else {
                                    h8.c.p(i40, "Invalid G3 character: ", "Cea708Decoder");
                                    this.f13786m.a('_');
                                }
                                z10 = true;
                            } else {
                                h8.c.p(i40, "Invalid extended command: ", "Cea708Decoder");
                            }
                        }
                        i6 = 2;
                    }
                }
            }
        }
        if (z10) {
            this.f13787n = l();
        }
        this.f13789p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.f.l():java.util.List");
    }

    public final void m() {
        for (int i6 = 0; i6 < 8; i6++) {
            this.f13785l[i6].d();
        }
    }
}
