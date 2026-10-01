package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import com.playfy.tv.R;
import db.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k4.i0;
import ld.o;
import r1.e1;
import r1.f1;
import r1.k1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2669x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2670y;

    public /* synthetic */ l(Object obj, int i6) {
        this.f2669x = i6;
        this.f2670y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4;
        boolean z10;
        switch (this.f2669x) {
            case 0:
                m mVar = (m) this.f2670y;
                int i6 = mVar.D0;
                if (i6 == 2) {
                    mVar.O(1);
                    mVar.G0.announceForAccessibility(mVar.i(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else {
                    if (i6 == 1) {
                        mVar.O(2);
                        mVar.F0.announceForAccessibility(mVar.i(R.string.mtrl_picker_toggled_to_year_selection));
                        return;
                    }
                    return;
                }
            case 1:
                i.f fVar = (i.f) this.f2670y;
                if (view == fVar.f6188m && (message4 = fVar.f6190o) != null) {
                    message = Message.obtain(message4);
                } else if (view == fVar.f6191p && (message3 = fVar.f6193r) != null) {
                    message = Message.obtain(message3);
                } else if (view == fVar.s && (message2 = fVar.f6195u) != null) {
                    message = Message.obtain(message2);
                } else {
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                fVar.I.obtainMessage(1, fVar.f6178b).sendToTarget();
                return;
            case 2:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f2670y;
                HashMap hashMap = trackSelectionView.D;
                boolean z11 = true;
                if (view == trackSelectionView.f1107z) {
                    trackSelectionView.I = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.A) {
                    trackSelectionView.I = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.I = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    i0 i0Var = (i0) tag;
                    k1 k1Var = i0Var.f7644a;
                    e1 e1Var = k1Var.f11571b;
                    int i10 = i0Var.f7645b;
                    f1 f1Var = (f1) hashMap.get(e1Var);
                    if (f1Var == null) {
                        if (!trackSelectionView.F && !hashMap.isEmpty()) {
                            hashMap.clear();
                        }
                        hashMap.put(e1Var, new f1(e1Var, k0.o(Integer.valueOf(i10))));
                    } else {
                        ArrayList arrayList = new ArrayList(f1Var.f11398b);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        if (trackSelectionView.E && k1Var.f11572c) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10 && (!trackSelectionView.F || trackSelectionView.C.size() <= 1)) {
                            z11 = false;
                        }
                        if (isChecked && z11) {
                            arrayList.remove(Integer.valueOf(i10));
                            if (arrayList.isEmpty()) {
                                hashMap.remove(e1Var);
                            } else {
                                hashMap.put(e1Var, new f1(e1Var, arrayList));
                            }
                        } else if (!isChecked) {
                            if (z10) {
                                arrayList.add(Integer.valueOf(i10));
                                hashMap.put(e1Var, new f1(e1Var, arrayList));
                            } else {
                                hashMap.put(e1Var, new f1(e1Var, k0.o(Integer.valueOf(i10))));
                            }
                        }
                    }
                }
                trackSelectionView.b();
                o.a aVar = trackSelectionView.J;
                if (aVar != null) {
                    boolean isDisabled = trackSelectionView.getIsDisabled();
                    Map<e1, f1> overrides = trackSelectionView.getOverrides();
                    aVar.B0 = isDisabled;
                    aVar.C0 = overrides;
                    return;
                }
                return;
            case 3:
                ((n.a) this.f2670y).a();
                return;
            default:
                ((Toolbar) this.f2670y).c();
                return;
        }
    }
}
