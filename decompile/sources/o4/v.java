package o4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.emoji2.text.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(j0 j0Var, int i) {
        super(j0Var);
        this.f9883d = i;
    }

    @Override // androidx.emoji2.text.h
    public final int d(View view) {
        int right;
        int i;
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                k0 k0Var = (k0) view.getLayoutParams();
                ((j0) this.f906b).getClass();
                right = view.getRight() + ((k0) view.getLayoutParams()).f9801b.right;
                i = ((ViewGroup.MarginLayoutParams) k0Var).rightMargin;
                break;
            default:
                k0 k0Var2 = (k0) view.getLayoutParams();
                ((j0) this.f906b).getClass();
                right = view.getBottom() + ((k0) view.getLayoutParams()).f9801b.bottom;
                i = ((ViewGroup.MarginLayoutParams) k0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // androidx.emoji2.text.h
    public final int e(View view) {
        int iA;
        int i;
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                k0 k0Var = (k0) view.getLayoutParams();
                ((j0) this.f906b).getClass();
                iA = j0.A(view) + ((ViewGroup.MarginLayoutParams) k0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) k0Var).rightMargin;
                break;
            default:
                k0 k0Var2 = (k0) view.getLayoutParams();
                ((j0) this.f906b).getClass();
                iA = j0.z(view) + ((ViewGroup.MarginLayoutParams) k0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) k0Var2).bottomMargin;
                break;
        }
        return iA + i;
    }

    @Override // androidx.emoji2.text.h
    public final int f(View view) {
        int iZ;
        int i;
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                k0 k0Var = (k0) view.getLayoutParams();
                ((j0) this.f906b).getClass();
                iZ = j0.z(view) + ((ViewGroup.MarginLayoutParams) k0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin;
                break;
            default:
                k0 k0Var2 = (k0) view.getLayoutParams();
                ((j0) this.f906b).getClass();
                iZ = j0.A(view) + ((ViewGroup.MarginLayoutParams) k0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) k0Var2).rightMargin;
                break;
        }
        return iZ + i;
    }

    @Override // androidx.emoji2.text.h
    public final int g(View view) {
        int left;
        int i;
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                k0 k0Var = (k0) view.getLayoutParams();
                ((j0) this.f906b).getClass();
                left = view.getLeft() - ((k0) view.getLayoutParams()).f9801b.left;
                i = ((ViewGroup.MarginLayoutParams) k0Var).leftMargin;
                break;
            default:
                k0 k0Var2 = (k0) view.getLayoutParams();
                ((j0) this.f906b).getClass();
                left = view.getTop() - ((k0) view.getLayoutParams()).f9801b.top;
                i = ((ViewGroup.MarginLayoutParams) k0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // androidx.emoji2.text.h
    public final int h() {
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((j0) this.f906b).f9774n;
            default:
                return ((j0) this.f906b).f9775o;
        }
    }

    @Override // androidx.emoji2.text.h
    public final int i() {
        int i;
        int iE;
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                j0 j0Var = (j0) this.f906b;
                i = j0Var.f9774n;
                iE = j0Var.E();
                break;
            default:
                j0 j0Var2 = (j0) this.f906b;
                i = j0Var2.f9775o;
                iE = j0Var2.C();
                break;
        }
        return i - iE;
    }

    @Override // androidx.emoji2.text.h
    public final int j() {
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((j0) this.f906b).E();
            default:
                return ((j0) this.f906b).C();
        }
    }

    @Override // androidx.emoji2.text.h
    public final int k() {
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((j0) this.f906b).f9772l;
            default:
                return ((j0) this.f906b).f9773m;
        }
    }

    @Override // androidx.emoji2.text.h
    public final int l() {
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((j0) this.f906b).f9773m;
            default:
                return ((j0) this.f906b).f9772l;
        }
    }

    @Override // androidx.emoji2.text.h
    public final int m() {
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((j0) this.f906b).D();
            default:
                return ((j0) this.f906b).F();
        }
    }

    @Override // androidx.emoji2.text.h
    public final int n() {
        int iD;
        int iE;
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                j0 j0Var = (j0) this.f906b;
                iD = j0Var.f9774n - j0Var.D();
                iE = j0Var.E();
                break;
            default:
                j0 j0Var2 = (j0) this.f906b;
                iD = j0Var2.f9775o - j0Var2.F();
                iE = j0Var2.C();
                break;
        }
        return iD - iE;
    }

    @Override // androidx.emoji2.text.h
    public final int o(View view) {
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                j0 j0Var = (j0) this.f906b;
                Rect rect = (Rect) this.f907c;
                j0Var.J(rect, view);
                return rect.right;
            default:
                j0 j0Var2 = (j0) this.f906b;
                Rect rect2 = (Rect) this.f907c;
                j0Var2.J(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.h
    public final int p(View view) {
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                j0 j0Var = (j0) this.f906b;
                Rect rect = (Rect) this.f907c;
                j0Var.J(rect, view);
                return rect.left;
            default:
                j0 j0Var2 = (j0) this.f906b;
                Rect rect2 = (Rect) this.f907c;
                j0Var2.J(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.h
    public final void q(int i) {
        switch (this.f9883d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((j0) this.f906b).O(i);
                break;
            default:
                ((j0) this.f906b).P(i);
                break;
        }
    }
}
