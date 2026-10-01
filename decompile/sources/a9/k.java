package a9;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f275w;

    public k(ChipGroup chipGroup) {
        this.f275w = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f275w;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            bf.d dVar = chipGroup.C;
            Chip chip = (Chip) view2;
            ((HashMap) dVar.f1622d).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                dVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new s5.c(25, dVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f274v;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f275w;
        if (view == chipGroup && (view2 instanceof Chip)) {
            bf.d dVar = chipGroup.C;
            Chip chip = (Chip) view2;
            dVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) dVar.f1622d).remove(Integer.valueOf(chip.getId()));
            ((HashSet) dVar.f1623e).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f274v;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
