package g1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import e1.k;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f5283a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.d f5284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i6;
        zb.d dVar = new zb.d(12);
        this.f5283a = editText;
        this.f5284b = dVar;
        if (k.f4160k != null) {
            k a10 = k.a();
            if (a10.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            e1.f fVar = a10.f4165e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            f1.b bVar = (f1.b) fVar.f4156c.f6781x;
            int a11 = bVar.a(4);
            if (a11 != 0) {
                i6 = ((ByteBuffer) bVar.A).getInt(a11 + bVar.f4630x);
            } else {
                i6 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i6);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i6, int i10) {
        Editable editableText = this.f5283a.getEditableText();
        this.f5284b.getClass();
        if (!zb.d.w(this, editableText, i6, i10, false) && !super.deleteSurroundingText(i6, i10)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i10) {
        Editable editableText = this.f5283a.getEditableText();
        this.f5284b.getClass();
        if (zb.d.w(this, editableText, i6, i10, true) || super.deleteSurroundingTextInCodePoints(i6, i10)) {
            return true;
        }
        return false;
    }
}
