package mc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class p extends a {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public jc.c f8609w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f8610x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f8611y0;

    @Override // androidx.fragment.app.y
    public final void E() {
        this.f8571v0 = "Network Stream";
        this.f8609w0.f7027e.setAdapter((SpinnerAdapter) new ArrayAdapter(I(), fc.m.dropdown_item, new String[]{"ClearKey", "Widevine", "PlayReady"}));
        this.f8610x0 = 7;
        this.f8609w0.f7032l.setAdapter((SpinnerAdapter) new ArrayAdapter(I(), fc.m.dropdown_item, vc.a.f13588a));
        this.f8609w0.f7032l.setOnItemSelectedListener(new o(0, this));
        this.f8609w0.f7023a.setOnClickListener(new gc.d(1));
        jc.c cVar = this.f8609w0;
        W(cVar.f7033m, cVar.f7034n);
        jc.c cVar2 = this.f8609w0;
        W(cVar2.f7024b, cVar2.f7025c);
        jc.c cVar3 = this.f8609w0;
        W(cVar3.f7030j, cVar3.f7031k);
        jc.c cVar4 = this.f8609w0;
        W(cVar4.f7028g, cVar4.f7029h);
        jc.c cVar5 = this.f8609w0;
        W(cVar5.f7026d, cVar5.f);
        jc.c cVar6 = this.f8609w0;
        W(cVar6.f7036p, cVar6.f7035o);
        jc.c cVar7 = this.f8609w0;
        V(cVar7.f7033m, cVar7.f7034n);
        jc.c cVar8 = this.f8609w0;
        V(cVar8.f7024b, cVar8.f7025c);
        jc.c cVar9 = this.f8609w0;
        V(cVar9.f7030j, cVar9.f7031k);
        jc.c cVar10 = this.f8609w0;
        V(cVar10.f7028g, cVar10.f7029h);
        jc.c cVar11 = this.f8609w0;
        V(cVar11.f7026d, cVar11.f);
        jc.c cVar12 = this.f8609w0;
        V(cVar12.f7036p, cVar12.f7035o);
        this.f8609w0.i.setOnClickListener(new com.google.android.material.datepicker.n(12, this));
    }

    public final void V(TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        textInputLayout.setEndIconOnClickListener(new hc.a(this, textInputLayout, textInputEditText, 3));
    }

    public final void W(TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        textInputEditText.addTextChangedListener(new kc.d(this, textInputLayout));
        textInputEditText.setOnFocusChangeListener(new kc.c(this, textInputEditText, textInputLayout));
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.fragment_ns, (ViewGroup) null, false);
        int i = fc.l.cookie;
        TextInputEditText textInputEditText = (TextInputEditText) a.a.k(viewInflate, i);
        if (textInputEditText != null) {
            i = fc.l.cookie_container;
            TextInputLayout textInputLayout = (TextInputLayout) a.a.k(viewInflate, i);
            if (textInputLayout != null) {
                i = fc.l.drm;
                TextInputEditText textInputEditText2 = (TextInputEditText) a.a.k(viewInflate, i);
                if (textInputEditText2 != null) {
                    i = fc.l.drm_button;
                    Spinner spinner = (Spinner) a.a.k(viewInflate, i);
                    if (spinner != null) {
                        i = fc.l.drm_container;
                        TextInputLayout textInputLayout2 = (TextInputLayout) a.a.k(viewInflate, i);
                        if (textInputLayout2 != null) {
                            i = fc.l.origin;
                            TextInputEditText textInputEditText3 = (TextInputEditText) a.a.k(viewInflate, i);
                            if (textInputEditText3 != null) {
                                i = fc.l.origin_container;
                                TextInputLayout textInputLayout3 = (TextInputLayout) a.a.k(viewInflate, i);
                                if (textInputLayout3 != null) {
                                    i = fc.l.play;
                                    FloatingActionButton floatingActionButton = (FloatingActionButton) a.a.k(viewInflate, i);
                                    if (floatingActionButton != null) {
                                        i = fc.l.referer;
                                        TextInputEditText textInputEditText4 = (TextInputEditText) a.a.k(viewInflate, i);
                                        if (textInputEditText4 != null) {
                                            i = fc.l.referer_container;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) a.a.k(viewInflate, i);
                                            if (textInputLayout4 != null) {
                                                i = fc.l.ua_button;
                                                Spinner spinner2 = (Spinner) a.a.k(viewInflate, i);
                                                if (spinner2 != null) {
                                                    i = fc.l.url;
                                                    TextInputEditText textInputEditText5 = (TextInputEditText) a.a.k(viewInflate, i);
                                                    if (textInputEditText5 != null) {
                                                        i = fc.l.url_container;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) a.a.k(viewInflate, i);
                                                        if (textInputLayout5 != null) {
                                                            i = fc.l.user_agent_container;
                                                            TextInputLayout textInputLayout6 = (TextInputLayout) a.a.k(viewInflate, i);
                                                            if (textInputLayout6 != null) {
                                                                i = fc.l.user_agent_txt;
                                                                TextInputEditText textInputEditText6 = (TextInputEditText) a.a.k(viewInflate, i);
                                                                if (textInputEditText6 != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                    this.f8609w0 = new jc.c(constraintLayout, textInputEditText, textInputLayout, textInputEditText2, spinner, textInputLayout2, textInputEditText3, textInputLayout3, floatingActionButton, textInputEditText4, textInputLayout4, spinner2, textInputEditText5, textInputLayout5, textInputLayout6, textInputEditText6);
                                                                    return constraintLayout;
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
