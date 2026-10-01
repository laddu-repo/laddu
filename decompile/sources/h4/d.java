package h4;

import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.emoji2.text.v;
import androidx.fragment.app.d1;
import androidx.fragment.app.i0;
import androidx.fragment.app.q0;
import androidx.media3.decoder.DecoderInputBuffer;
import c.a0;
import c.x;
import com.livxow.tv.activities.MainActivity;
import com.livxow.tv.activities.PlayerActivity;
import com.livxow.tv.activities.TvActivity;
import sb.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f6126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6127b;

    public final void a() {
        p pVar = this.f6126a;
        if (pVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f6127b) {
            pVar.g(this, null);
        }
        e eVar = (e) pVar.f11743x;
        d1 d1Var = (d1) pVar.f11742w;
        eVar.getClass();
        if (equals(eVar.f6134h) && -1 == eVar.f6133g) {
            x xVarC = eVar.f;
            if (xVarC == null) {
                xVarC = eVar.c(-1);
            }
            eVar.f = null;
            eVar.f6133g = 0;
            eVar.f6134h = null;
            if (xVarC != null) {
                i0 i0Var = xVarC.f1675d;
                switch (i0Var.f1030d) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        q0 q0Var = (q0) i0Var.f1031e;
                        q0Var.y(true);
                        if (!q0Var.f1074h.f1028b) {
                            q0Var.f1073g.b().a();
                        } else {
                            q0Var.Q();
                        }
                        break;
                    case 1:
                        ((MainActivity) i0Var.f1031e).w();
                        break;
                    case 2:
                        ((PlayerActivity) i0Var.f1031e).v();
                        break;
                    default:
                        TvActivity tvActivity = (TvActivity) i0Var.f1031e;
                        if (tvActivity.f3679a0 != -1) {
                            tvActivity.f3679a0 = 0;
                        }
                        if (tvActivity.W.i.getVisibility() == 0) {
                            tvActivity.W.i.setText("");
                            tvActivity.W.f7067h.setVisibility(8);
                            tvActivity.W.i.setVisibility(8);
                            tvActivity.W.f7061a.setVisibility(0);
                            tvActivity.W.i.clearFocus();
                            ((InputMethodManager) tvActivity.getSystemService("input_method")).hideSoftInputFromWindow(tvActivity.W.i.getWindowToken(), 0);
                        } else if (tvActivity.Z) {
                            tvActivity.finish();
                        } else if (tvActivity.f3681c0.a()) {
                            Toast.makeText(tvActivity, "Tap again to exit", 0).show();
                            tvActivity.Z = true;
                            new Handler(Looper.getMainLooper()).postDelayed(new v(21, tvActivity), 2000L);
                        }
                        break;
                }
            } else {
                ((a0) d1Var.f1006w).f1624a.run();
            }
            pe.x xVar = eVar.f6128a;
            xVar.getClass();
            xVar.P(null, f.f6140a);
        }
        this.f6127b = false;
    }

    public void b(boolean z2) {
    }
}
