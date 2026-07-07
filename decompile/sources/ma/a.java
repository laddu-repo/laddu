package ma;

import a2.a2;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8723a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8724b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public r f8725c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8726d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8727e;

    public final boolean a(h hVar) {
        int id2 = hVar.getId();
        Integer valueOf = Integer.valueOf(id2);
        HashSet hashSet = this.f8724b;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        h hVar2 = (h) this.f8723a.get(Integer.valueOf(c()));
        if (hVar2 != null) {
            e(hVar2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id2));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f8724b);
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if ((childAt instanceof h) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (this.f8726d) {
            HashSet hashSet = this.f8724b;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
            return -1;
        }
        return -1;
    }

    public final void d() {
        r rVar = this.f8725c;
        if (rVar != null) {
            new HashSet(this.f8724b);
            ChipGroup chipGroup = (ChipGroup) rVar.f12916y;
            ea.i iVar = chipGroup.D;
            if (iVar != null) {
                chipGroup.E.b(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((a2) iVar).f162y;
                if (chipGroup2.E.f8726d) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(h hVar, boolean z10) {
        int id2 = hVar.getId();
        Integer valueOf = Integer.valueOf(id2);
        HashSet hashSet = this.f8724b;
        if (!hashSet.contains(valueOf)) {
            return false;
        }
        if (z10 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            hVar.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id2));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return remove;
    }
}
