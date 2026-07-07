package gd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.imageview.ShapeableImageView;
import com.playfy.tv.R;
import com.playfy.tv.databinding.CatItemBinding;
import com.playfy.tv.databinding.SettingItemBinding;
import kd.i0;
import kd.j0;
import w4.e0;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends e0 {
    public final /* synthetic */ int B = 0;
    public final ve.l C;

    public c(cf.n nVar) {
        super(new y(1));
        this.C = nVar;
    }

    @Override // w4.k0
    public int c(int i6) {
        switch (this.B) {
            case 1:
                if (((j0) h(i6)).f7872d == i0.f7865x) {
                    return 0;
                }
                return 1;
            default:
                return super.c(i6);
        }
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        int i10;
        int i11;
        int i12;
        switch (this.B) {
            case 0:
                Object h4 = h(i6);
                kotlin.jvm.internal.k.d(h4, "getItem(...)");
                kd.i iVar = (kd.i) h4;
                CatItemBinding catItemBinding = ((b) i1Var).f5609u;
                ShapeableImageView shapeableImageView = catItemBinding.f3200b;
                String str = iVar.f7862c;
                l6.f a10 = l6.a.a(shapeableImageView.getContext());
                v6.i iVar2 = new v6.i(shapeableImageView.getContext());
                iVar2.f13364c = str;
                iVar2.c(shapeableImageView);
                iVar2.b(true);
                cf.m.J(iVar2);
                ((l6.k) a10).b(iVar2.a());
                catItemBinding.f3201c.setText(iVar.f7861b);
                return;
            default:
                j0 j0Var = (j0) h(i6);
                if (i1Var instanceof z) {
                    ((z) i1Var).f5646u.setText(j0Var.f7869a);
                    return;
                }
                if (i1Var instanceof a0) {
                    a0 a0Var = (a0) i1Var;
                    kotlin.jvm.internal.k.b(j0Var);
                    String str2 = j0Var.f7870b;
                    SettingItemBinding settingItemBinding = a0Var.f5608u;
                    TextView textView = settingItemBinding.f3360h;
                    ImageView imageView = settingItemBinding.f3356d;
                    ImageView imageView2 = settingItemBinding.f3355c;
                    TextView textView2 = settingItemBinding.f3358f;
                    SwitchCompat switchCompat = settingItemBinding.f3359g;
                    textView.setText(j0Var.f7869a);
                    ImageView imageView3 = settingItemBinding.f3357e;
                    Integer num = j0Var.f7871c;
                    if (num != null) {
                        i10 = num.intValue();
                    } else {
                        i10 = 0;
                    }
                    imageView3.setImageResource(i10);
                    if (str2 != null) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView2.setVisibility(i11);
                    textView2.setText(str2);
                    TextView textView3 = settingItemBinding.f3354b;
                    if (j0Var.f7874f) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView3.setVisibility(i12);
                    imageView2.setVisibility(8);
                    switchCompat.setVisibility(8);
                    imageView.setVisibility(8);
                    Context context = a0Var.f13897a.getContext();
                    int ordinal = j0Var.f7872d.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    imageView.setVisibility(0);
                                    return;
                                }
                            } else {
                                switchCompat.setVisibility(0);
                                switchCompat.setChecked(j0Var.f7873e);
                                int c10 = i0.f.c(context, R.color.primary_color);
                                int c11 = i0.f.c(context, R.color.text_secondary);
                                switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{-1, -1}));
                                switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{c10, c11}));
                                return;
                            }
                        }
                        imageView2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        switch (this.B) {
            case 0:
                return new b(this, CatItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            default:
                if (i6 == 0) {
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.setting_item_header, viewGroup, false);
                    kotlin.jvm.internal.k.b(inflate);
                    return new z(inflate);
                }
                return new a0(this, SettingItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    public c(cf.n nVar, byte b10) {
        super(y.f5644e);
        this.C = nVar;
    }
}
