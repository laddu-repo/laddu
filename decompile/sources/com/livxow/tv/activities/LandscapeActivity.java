package com.livxow.tv.activities;

import ad.c;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import c.m;
import c2.j0;
import com.livxow.tv.activities.LandscapeActivity;
import com.livxow.tv.app.App;
import com.livxow.tv.services.FloatingPlayer;
import fc.l;
import g4.g0;
import h.j;
import jc.e;
import t1.y0;
import uc.g;
import vc.a;
import y9.c0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class LandscapeActivity extends j {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f3630a0 = 0;
    public App W;
    public g X;
    public e Y;
    public PlayerView Z;

    @Override // c.j, android.app.Activity
    public final void onBackPressed() {
        if (this.X.D) {
            Toast.makeText(this, "Please Unlock Player Controls first!", 0).show();
        } else {
            super.onBackPressed();
        }
    }

    @Override // h.j, c.j, h0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        m.a(this);
        super.onCreate(bundle);
        c cVarP = c.p(getLayoutInflater());
        setContentView((RelativeLayout) cVarP.f479w);
        App app = App.P;
        this.W = app;
        app.f3687x = this;
        a.o(this);
        this.X = FloatingPlayer.F.A;
        PlayerView playerView = (PlayerView) cVarP.f481y;
        this.Z = playerView;
        e eVarA = e.a(playerView.findViewById(l.player_controls));
        this.Y = eVarA;
        this.X.f(this, cVarP, eVarA, true);
        ProgressBar progressBar = (ProgressBar) this.Z.findViewById(g0.exo_buffering);
        if (progressBar != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(getColor(fc.j.app_color), PorterDuff.Mode.SRC_IN);
        }
        g gVar = this.X;
        if (!gVar.f12969u && !gVar.f12970v) {
            gVar.c();
        }
        int iS = this.X.f.S();
        if (iS == 1 || iS == 3) {
            ((TextView) cVarP.f480x).setVisibility(0);
        }
        ((TextView) cVarP.f480x).setText(this.W.M);
        RecyclerView recyclerView = this.X.f12956g;
        if (recyclerView != null) {
            ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(recyclerView);
            }
            this.Y.f7057l.addView(recyclerView);
            this.Y.f7057l.setVisibility(0);
        }
        this.Y.f7055j.setVisibility(8);
        this.Y.f7053g.setVisibility(8);
        this.Y.f7050c.setVisibility(0);
        this.Y.f7060o.setVisibility(0);
        this.Y.f7049b.setVisibility(0);
        this.Y.f7052e.setVisibility(0);
        this.Y.f.setVisibility(0);
        this.Y.f7058m.setVisibility(0);
        this.Y.f7056k.setVisibility(0);
        final int i = 0;
        this.Y.f7049b.setOnClickListener(new View.OnClickListener(this) { // from class: gc.a

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ LandscapeActivity f5798w;

            {
                this.f5798w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i;
                int i11 = 0;
                LandscapeActivity landscapeActivity = this.f5798w;
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        int i12 = LandscapeActivity.f3630a0;
                        landscapeActivity.finish();
                        break;
                    case 1:
                        int resizeMode = landscapeActivity.Z.getResizeMode();
                        if (resizeMode == 0) {
                            landscapeActivity.Z.setResizeMode(3);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_crop);
                            break;
                        } else if (resizeMode == 3) {
                            landscapeActivity.Z.setResizeMode(4);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_fit);
                            break;
                        } else if (resizeMode == 4) {
                            landscapeActivity.Z.setResizeMode(0);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_fill);
                            break;
                        }
                        break;
                    default:
                        j0 j0Var = landscapeActivity.X.f;
                        if (j0Var != null) {
                            z0 z0Var = kc.o.O0;
                            c0 c0VarListIterator = j0Var.O().f12184a.listIterator(0);
                            while (c0VarListIterator.hasNext()) {
                                if (kc.o.O0.contains(Integer.valueOf(((y0) c0VarListIterator.next()).f12174b.f12113c))) {
                                    kc.o.T(landscapeActivity.X.f, new b(landscapeActivity, i11)).R(landscapeActivity.o(), null);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.Y.f7058m.setOnClickListener(new View.OnClickListener(this) { // from class: gc.a

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ LandscapeActivity f5798w;

            {
                this.f5798w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                int i11 = 0;
                LandscapeActivity landscapeActivity = this.f5798w;
                switch (i102) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        int i12 = LandscapeActivity.f3630a0;
                        landscapeActivity.finish();
                        break;
                    case 1:
                        int resizeMode = landscapeActivity.Z.getResizeMode();
                        if (resizeMode == 0) {
                            landscapeActivity.Z.setResizeMode(3);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_crop);
                            break;
                        } else if (resizeMode == 3) {
                            landscapeActivity.Z.setResizeMode(4);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_fit);
                            break;
                        } else if (resizeMode == 4) {
                            landscapeActivity.Z.setResizeMode(0);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_fill);
                            break;
                        }
                        break;
                    default:
                        j0 j0Var = landscapeActivity.X.f;
                        if (j0Var != null) {
                            z0 z0Var = kc.o.O0;
                            c0 c0VarListIterator = j0Var.O().f12184a.listIterator(0);
                            while (c0VarListIterator.hasNext()) {
                                if (kc.o.O0.contains(Integer.valueOf(((y0) c0VarListIterator.next()).f12174b.f12113c))) {
                                    kc.o.T(landscapeActivity.X.f, new b(landscapeActivity, i11)).R(landscapeActivity.o(), null);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        final int i11 = 2;
        this.Y.f.setOnClickListener(new View.OnClickListener(this) { // from class: gc.a

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ LandscapeActivity f5798w;

            {
                this.f5798w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i11;
                int i112 = 0;
                LandscapeActivity landscapeActivity = this.f5798w;
                switch (i102) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        int i12 = LandscapeActivity.f3630a0;
                        landscapeActivity.finish();
                        break;
                    case 1:
                        int resizeMode = landscapeActivity.Z.getResizeMode();
                        if (resizeMode == 0) {
                            landscapeActivity.Z.setResizeMode(3);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_crop);
                            break;
                        } else if (resizeMode == 3) {
                            landscapeActivity.Z.setResizeMode(4);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_fit);
                            break;
                        } else if (resizeMode == 4) {
                            landscapeActivity.Z.setResizeMode(0);
                            landscapeActivity.Y.f7058m.setImageResource(fc.k.mode_fill);
                            break;
                        }
                        break;
                    default:
                        j0 j0Var = landscapeActivity.X.f;
                        if (j0Var != null) {
                            z0 z0Var = kc.o.O0;
                            c0 c0VarListIterator = j0Var.O().f12184a.listIterator(0);
                            while (c0VarListIterator.hasNext()) {
                                if (kc.o.O0.contains(Integer.valueOf(((y0) c0VarListIterator.next()).f12174b.f12113c))) {
                                    kc.o.T(landscapeActivity.X.f, new b(landscapeActivity, i112)).R(landscapeActivity.o(), null);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // h.j, android.app.Activity
    public final void onDestroy() {
        FloatingPlayer floatingPlayer = (FloatingPlayer) this.W.f3688y.f10443w;
        FloatingPlayer floatingPlayer2 = FloatingPlayer.F;
        floatingPlayer.a();
        this.W.f3687x = null;
        super.onDestroy();
    }

    @Override // h.j, android.app.Activity
    public final void onPause() {
        g gVar = this.X;
        j0 j0Var = gVar.f;
        if (j0Var != null) {
            j0Var.w();
            gVar.f.h0(false);
        }
        super.onPause();
    }

    @Override // h.j, android.app.Activity
    public final void onResume() {
        g gVar = this.X;
        if (!gVar.f12969u && !gVar.f12970v) {
            gVar.c();
        }
        View view = FloatingPlayer.F.B;
        if (view != null) {
            view.setVisibility(8);
        }
        super.onResume();
    }
}
