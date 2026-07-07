package l3;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r1.j0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c9.a {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f8092f = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: d, reason: collision with root package name */
    public final CharsetDecoder f8093d = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: e, reason: collision with root package name */
    public final CharsetDecoder f8094e = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // c9.a
    public final j0 e(h3.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f8094e;
        CharsetDecoder charsetDecoder2 = this.f8093d;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new j0(new c(bArr, null, null));
        }
        Matcher matcher = f8092f.matcher(str);
        String str3 = null;
        for (int i6 = 0; matcher.find(i6); i6 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String p10 = dg.b.p(group);
                p10.getClass();
                if (!p10.equals("streamurl")) {
                    if (p10.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new j0(new c(bArr, str2, str3));
    }
}
