package y4;

import androidx.media3.decoder.DecoderInputBuffer;
import de.i;
import java.io.IOException;
import p4.v;
import x4.j;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f14452y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f14453z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w4.a aVar, String str, c cVar) {
        super(aVar, str);
        i.e(aVar, "db");
        i.e(str, "sql");
        this.f14453z = cVar;
    }

    @Override // v4.c
    public final void K(int i, String str) {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                i.e(str, "value");
                ((e) this.f14453z).K(i, str);
                return;
            case 1:
                i.e(str, "value");
                a();
                ((j) this.f14453z).t(i, str);
                return;
            default:
                i.e(str, "value");
                a();
                v.P(25, "column index out of range");
                throw null;
        }
    }

    @Override // y4.f, v4.c
    public boolean P() {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((e) this.f14453z).P();
            default:
                return super.P();
        }
    }

    @Override // v4.c
    public final boolean Z() {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                e eVar = (e) this.f14453z;
                boolean Z = eVar.Z();
                boolean zEqualsIgnoreCase = eVar.n(0).equalsIgnoreCase("wal");
                w4.a aVar = this.f14456v;
                if (zEqualsIgnoreCase) {
                    aVar.O();
                } else {
                    aVar.r();
                }
                return Z;
            case 1:
                a();
                ((j) this.f14453z).f14224w.execute();
                return false;
            default:
                int iOrdinal = ((c) this.f14453z).ordinal();
                w4.a aVar2 = this.f14456v;
                if (iOrdinal == 0) {
                    aVar2.R();
                    aVar2.j();
                    return false;
                }
                if (iOrdinal == 1) {
                    aVar2.j();
                    return false;
                }
                if (iOrdinal == 2) {
                    aVar2.k();
                    return false;
                }
                if (iOrdinal == 3) {
                    aVar2.T();
                    return false;
                }
                if (iOrdinal != 4) {
                    throw new a5.d();
                }
                aVar2.E();
                return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((e) this.f14453z).close();
                break;
            case 1:
                ((j) this.f14453z).close();
                this.f14458x = true;
                break;
            default:
                this.f14458x = true;
                break;
        }
    }

    @Override // v4.c
    public final void e(int i) {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((e) this.f14453z).e(i);
                return;
            case 1:
                a();
                ((j) this.f14453z).e(i);
                return;
            default:
                a();
                v.P(25, "column index out of range");
                throw null;
        }
    }

    @Override // v4.c
    public final int getColumnCount() {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            case 1:
                a();
                break;
            default:
                a();
                break;
        }
        return 0;
    }

    @Override // v4.c
    public final String getColumnName(int i) {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((e) this.f14453z).getColumnName(i);
            case 1:
                a();
                v.P(21, "no row");
                throw null;
            default:
                a();
                v.P(21, "no row");
                throw null;
        }
    }

    @Override // v4.c
    public final long getLong(int i) {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((e) this.f14453z).getLong(i);
            case 1:
                a();
                v.P(21, "no row");
                throw null;
            default:
                a();
                v.P(21, "no row");
                throw null;
        }
    }

    @Override // y4.f, v4.c
    public void h() {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((e) this.f14453z).h();
                break;
            case 1:
                a();
                ((j) this.f14453z).h();
                break;
            default:
                super.h();
                break;
        }
    }

    @Override // v4.c
    public final boolean isNull(int i) {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((e) this.f14453z).isNull(i);
            case 1:
                a();
                v.P(21, "no row");
                throw null;
            default:
                a();
                v.P(21, "no row");
                throw null;
        }
    }

    @Override // v4.c
    public final String n(int i) {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((e) this.f14453z).n(i);
            case 1:
                a();
                v.P(21, "no row");
                throw null;
            default:
                a();
                v.P(21, "no row");
                throw null;
        }
    }

    @Override // v4.c
    public final void o(long j8) {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((e) this.f14453z).o(j8);
                return;
            case 1:
                a();
                ((j) this.f14453z).N(1, j8);
                return;
            default:
                a();
                v.P(25, "column index out of range");
                throw null;
        }
    }

    @Override // y4.f, v4.c
    public void reset() {
        switch (this.f14452y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((e) this.f14453z).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w4.a aVar, String str, e eVar) {
        super(aVar, str);
        i.e(aVar, "db");
        i.e(str, "sql");
        this.f14453z = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w4.a aVar, String str) {
        super(aVar, str);
        i.e(aVar, "db");
        i.e(str, "sql");
        this.f14453z = aVar.x(str);
    }
}
