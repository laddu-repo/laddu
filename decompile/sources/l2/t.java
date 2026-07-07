package l2;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Comparator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8146w;

    public /* synthetic */ t(int i, Object obj) {
        this.f8145v = i;
        this.f8146w = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8145v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                x xVar = (x) this.f8146w;
                return xVar.f(obj2) - xVar.f(obj);
            case 1:
                List list = (List) this.f8146w;
                int iIndexOf = list.indexOf(((pc.d) obj).f10492a);
                int iIndexOf2 = list.indexOf(((pc.d) obj2).f10492a);
                if (iIndexOf == -1) {
                    iIndexOf = Integer.MAX_VALUE;
                }
                if (iIndexOf2 == -1) {
                    iIndexOf2 = Integer.MAX_VALUE;
                }
                return Integer.compare(iIndexOf, iIndexOf2);
            default:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f8146w;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.J).compareTo(Boolean.valueOf(materialButton2.J));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
        }
    }
}
