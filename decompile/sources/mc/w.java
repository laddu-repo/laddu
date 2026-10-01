package mc;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.q0;
import androidx.media3.decoder.DecoderInputBuffer;
import com.livxow.tv.app.App;
import k8.k2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class w extends a {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public jc.a f8623w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public pc.a f8624x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public a f8625y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public App f8626z0;

    @Override // androidx.fragment.app.y
    public final void E() {
        App app = App.P;
        this.f8626z0 = app;
        this.f8624x0 = app.f3685v;
        ((NestedScrollView) this.f8623w0.f7018q).setClipToPadding(false);
        NestedScrollView nestedScrollView = (NestedScrollView) this.f8623w0.f7018q;
        nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), ((NestedScrollView) this.f8623w0.f7018q).getPaddingTop(), ((NestedScrollView) this.f8623w0.f7018q).getPaddingRight(), this.f8626z0.O);
        this.f8623w0.f7007d.setClipToPadding(false);
        FrameLayout frameLayout = this.f8623w0.f7007d;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), this.f8623w0.f7007d.getPaddingTop(), this.f8623w0.f7007d.getPaddingRight(), this.f8626z0.O);
        this.f8623w0.f7004a.setText("Version " + this.f8626z0.N);
        final int i = 0;
        ((LinearLayout) this.f8623w0.f7012k).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i10 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i10);
                        if (switchCompat != null) {
                            i10 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i10);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i11 = vc.a.j(context).getInt("floatings", 0);
                                if (i11 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i11 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i10 = 8;
        ((LinearLayout) this.f8623w0.f7010h).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i11 = vc.a.j(context).getInt("floatings", 0);
                                if (i11 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i11 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i11 = 9;
        ((LinearLayout) this.f8623w0.i).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i12 = 10;
        this.f8623w0.f7006c.setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i13 = 11;
        ((LinearLayout) this.f8623w0.f7009g).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i14 = 1;
        ((LinearLayout) this.f8623w0.f7008e).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i15 = 2;
        ((LinearLayout) this.f8623w0.f7011j).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        this.f8623w0.f7005b.setOnClickListener(new gc.d(this));
        final int i16 = 3;
        ((LinearLayout) this.f8623w0.f7014m).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i17 = 4;
        ((LinearLayout) this.f8623w0.f).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        ((SwitchCompat) this.f8623w0.f7019r).setChecked(vc.a.j(j()).getBoolean("video_setting", false));
        ((SwitchCompat) this.f8623w0.f7019r).setOnCheckedChangeListener(new v());
        final int i18 = 5;
        ((LinearLayout) this.f8623w0.f7017p).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i19 = 6;
        ((LinearLayout) this.f8623w0.f7016o).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        final int i20 = 7;
        ((LinearLayout) this.f8623w0.f7015n).setOnClickListener(new View.OnClickListener(this) { // from class: mc.s

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ w f8618w;

            {
                this.f8618w = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [mc.t] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        r rVar = new r();
                        w wVar = this.f8618w;
                        wVar.f8625y0 = rVar;
                        wVar.V();
                        wVar.f8626z0.f3689z.c("Playlists");
                        return;
                    case 1:
                        w wVar2 = this.f8618w;
                        wVar2.getClass();
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.fromParts("mailto", wVar2.f8624x0.f10471d, null));
                        try {
                            wVar2.O(Intent.createChooser(intent, "Send email using..."));
                            return;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(view.getContext(), "No email clients installed.", 0).show();
                            return;
                        }
                    case 2:
                        final Context context = view.getContext();
                        w wVar3 = this.f8618w;
                        LayoutInflater layoutInflaterZ = wVar3.f1140g0;
                        if (layoutInflaterZ == null) {
                            layoutInflaterZ = wVar3.z(null);
                            wVar3.f1140g0 = layoutInflaterZ;
                        }
                        View viewInflate = layoutInflaterZ.inflate(fc.m.dialog_floating_player, (ViewGroup) null, false);
                        int i102 = fc.l.enable_sw;
                        SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i102);
                        if (switchCompat != null) {
                            i102 = fc.l.sp;
                            Spinner spinner = (Spinner) a.a.k(viewInflate, i102);
                            if (spinner != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                final k2 k2Var = new k2(linearLayout, switchCompat, spinner);
                                int i112 = vc.a.j(context).getInt("floatings", 0);
                                if (i112 > 0) {
                                    switchCompat.setChecked(true);
                                    spinner.setAlpha(1.0f);
                                    spinner.setSelection(i112 - 1);
                                    spinner.setEnabled(true);
                                    spinner.setClickable(true);
                                } else {
                                    spinner.setEnabled(false);
                                    spinner.setClickable(false);
                                }
                                switchCompat.setOnCheckedChangeListener(new a9.a(1, k2Var));
                                c9.b bVar = new c9.b(context, 0);
                                bVar.c("Close", null);
                                bVar.e(linearLayout);
                                bVar.f5918a.f5845l = new DialogInterface.OnDismissListener() { // from class: mc.t
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        k2 k2Var2 = k2Var;
                                        vc.a.k(context).putInt("floatings", (((SwitchCompat) k2Var2.f7602w).isChecked() ? ((Spinner) k2Var2.f7603x).getSelectedItemPosition() : -1) + 1).apply();
                                    }
                                };
                                bVar.a();
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i102)));
                    case 3:
                        w wVar4 = this.f8618w;
                        wVar4.W(wVar4.f8624x0.f10469b);
                        return;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        c9.b bVarD = new c9.b(view.getContext(), 0).d("Exit");
                        bVarD.f5918a.f = "Want to exit?";
                        bVarD.c("Exit", new u(0, this.f8618w));
                        bVarD.b();
                        bVarD.a();
                        return;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        ((SwitchCompat) this.f8618w.f8623w0.f7019r).performClick();
                        return;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        w wVar5 = this.f8618w;
                        wVar5.W(wVar5.f8624x0.f10472e);
                        return;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        w wVar6 = this.f8618w;
                        wVar6.W(wVar6.f8624x0.f10472e);
                        return;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        m mVar = new m();
                        w wVar7 = this.f8618w;
                        wVar7.f8625y0 = mVar;
                        wVar7.V();
                        wVar7.f8626z0.f3689z.c("Highlights");
                        return;
                    case 9:
                        p pVar = new p();
                        w wVar8 = this.f8618w;
                        wVar8.f8625y0 = pVar;
                        wVar8.V();
                        wVar8.f8626z0.f3689z.c("Network Stream");
                        return;
                    case 10:
                        w wVar9 = this.f8618w;
                        String str = wVar9.f8624x0.f10473g;
                        b0 b0Var = new b0();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str);
                        bundle.putString("title", "Cricket Score");
                        b0Var.L(bundle);
                        wVar9.f8625y0 = b0Var;
                        wVar9.V();
                        wVar9.f8626z0.f3689z.c("Cricket Score");
                        return;
                    default:
                        w wVar10 = this.f8618w;
                        String str2 = wVar10.f8624x0.f10474h;
                        b0 b0Var2 = new b0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", str2);
                        bundle2.putString("title", "Football Score");
                        b0Var2.L(bundle2);
                        wVar10.f8625y0 = b0Var2;
                        wVar10.V();
                        wVar10.f8626z0.f3689z.c("Football Score");
                        return;
                }
            }
        });
        ((LinearLayout) this.f8623w0.f7013l).setOnClickListener(new gc.d(3));
    }

    @Override // mc.a
    public final boolean P() {
        a aVar = this.f8625y0;
        if (aVar == null) {
            return true;
        }
        if ((aVar instanceof r) && !((r) aVar).P()) {
            return false;
        }
        q0 q0VarI = i();
        q0VarI.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(q0VarI);
        aVar2.g(this.f8625y0);
        aVar2.d(false);
        this.f8625y0 = null;
        this.f8623w0.f7007d.setVisibility(8);
        this.f8626z0.f3689z.c(this.f8571v0);
        return false;
    }

    @Override // mc.a
    public final String Q() {
        a aVar = this.f8625y0;
        return aVar != null ? aVar.Q() : this.f8571v0;
    }

    @Override // mc.a
    public final void U(String str) {
        a aVar = this.f8625y0;
        if (aVar != null) {
            aVar.U(str);
        }
    }

    public final void V() {
        q0 q0VarI = i();
        q0VarI.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(q0VarI);
        aVar.h(fc.l.fm_container, this.f8625y0);
        aVar.d(false);
        this.f8623w0.f7007d.setVisibility(0);
    }

    public final void W(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            O(intent);
        } catch (ActivityNotFoundException e7) {
            Toast.makeText(j(), e7.getMessage(), 0).show();
        }
    }

    @Override // androidx.fragment.app.y
    public final void v(Bundle bundle) {
        super.v(bundle);
        this.f8571v0 = "Menu";
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.fragment_settings, viewGroup, false);
        int i = fc.l.app_name;
        if (((TextView) a.a.k(viewInflate, i)) != null) {
            i = fc.l.app_version;
            TextView textView = (TextView) a.a.k(viewInflate, i);
            if (textView != null) {
                i = fc.l.btn_copyright;
                LinearLayout linearLayout = (LinearLayout) a.a.k(viewInflate, i);
                if (linearLayout != null) {
                    i = fc.l.btn_cric_score;
                    LinearLayout linearLayout2 = (LinearLayout) a.a.k(viewInflate, i);
                    if (linearLayout2 != null) {
                        i = fc.l.btn_email;
                        LinearLayout linearLayout3 = (LinearLayout) a.a.k(viewInflate, i);
                        if (linearLayout3 != null) {
                            i = fc.l.btn_exit;
                            LinearLayout linearLayout4 = (LinearLayout) a.a.k(viewInflate, i);
                            if (linearLayout4 != null) {
                                i = fc.l.btn_foot_score;
                                LinearLayout linearLayout5 = (LinearLayout) a.a.k(viewInflate, i);
                                if (linearLayout5 != null) {
                                    i = fc.l.btn_highlights;
                                    LinearLayout linearLayout6 = (LinearLayout) a.a.k(viewInflate, i);
                                    if (linearLayout6 != null) {
                                        i = fc.l.btn_network_stream;
                                        LinearLayout linearLayout7 = (LinearLayout) a.a.k(viewInflate, i);
                                        if (linearLayout7 != null) {
                                            i = fc.l.btn_pip;
                                            LinearLayout linearLayout8 = (LinearLayout) a.a.k(viewInflate, i);
                                            if (linearLayout8 != null) {
                                                i = fc.l.btn_playlists;
                                                LinearLayout linearLayout9 = (LinearLayout) a.a.k(viewInflate, i);
                                                if (linearLayout9 != null) {
                                                    i = fc.l.btn_share;
                                                    LinearLayout linearLayout10 = (LinearLayout) a.a.k(viewInflate, i);
                                                    if (linearLayout10 != null) {
                                                        i = fc.l.btn_telegram;
                                                        LinearLayout linearLayout11 = (LinearLayout) a.a.k(viewInflate, i);
                                                        if (linearLayout11 != null) {
                                                            i = fc.l.btn_update;
                                                            LinearLayout linearLayout12 = (LinearLayout) a.a.k(viewInflate, i);
                                                            if (linearLayout12 != null) {
                                                                i = fc.l.btn_website;
                                                                LinearLayout linearLayout13 = (LinearLayout) a.a.k(viewInflate, i);
                                                                if (linearLayout13 != null) {
                                                                    i = fc.l.fm_container;
                                                                    FrameLayout frameLayout = (FrameLayout) a.a.k(viewInflate, i);
                                                                    if (frameLayout != null) {
                                                                        i = fc.l.icon_card;
                                                                        if (((CardView) a.a.k(viewInflate, i)) != null) {
                                                                            i = fc.l.row_force_low;
                                                                            LinearLayout linearLayout14 = (LinearLayout) a.a.k(viewInflate, i);
                                                                            if (linearLayout14 != null) {
                                                                                i = fc.l.scrollView;
                                                                                NestedScrollView nestedScrollView = (NestedScrollView) a.a.k(viewInflate, i);
                                                                                if (nestedScrollView != null) {
                                                                                    i = fc.l.switch_force_low;
                                                                                    SwitchCompat switchCompat = (SwitchCompat) a.a.k(viewInflate, i);
                                                                                    if (switchCompat != null) {
                                                                                        LinearLayout linearLayout15 = (LinearLayout) viewInflate;
                                                                                        this.f8623w0 = new jc.a(linearLayout15, textView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, frameLayout, linearLayout14, nestedScrollView, switchCompat);
                                                                                        return linearLayout15;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
