package yf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f15068a;

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f15069b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f15070c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15071d;

    /* renamed from: e, reason: collision with root package name */
    public char f15072e;

    public h(InputStream inputStream, Charset charset) {
        byte[] bArr;
        Object removeLast;
        kotlin.jvm.internal.k.e(inputStream, "inputStream");
        kotlin.jvm.internal.k.e(charset, "charset");
        this.f15068a = inputStream;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        kotlin.jvm.internal.k.d(onUnmappableCharacter, "onUnmappableCharacter(...)");
        this.f15069b = onUnmappableCharacter;
        c cVar = c.f15061c;
        synchronized (cVar) {
            ie.h hVar = cVar.f15062a;
            bArr = null;
            if (hVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = hVar.removeLast();
            }
            byte[] bArr2 = (byte[]) removeLast;
            if (bArr2 != null) {
                cVar.f15063b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        kotlin.jvm.internal.k.d(wrap, "wrap(...)");
        this.f15070c = wrap;
        wrap.flip();
    }

    public final int a(char[] cArr, int i6, int i10) {
        int i11;
        CharsetDecoder charsetDecoder;
        int i12;
        char c10;
        if (i10 == 0) {
            return 0;
        }
        if (i6 >= 0 && i6 < cArr.length && i10 >= 0 && i6 + i10 <= cArr.length) {
            boolean z10 = true;
            if (this.f15071d) {
                cArr[i6] = this.f15072e;
                i6++;
                i10--;
                this.f15071d = false;
                if (i10 == 0) {
                    return 1;
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
            int i13 = -1;
            if (i10 == 1) {
                if (this.f15071d) {
                    this.f15071d = false;
                    c10 = this.f15072e;
                } else {
                    char[] cArr2 = new char[2];
                    int a10 = a(cArr2, 0, 2);
                    if (a10 != -1) {
                        if (a10 != 1) {
                            if (a10 == 2) {
                                this.f15072e = cArr2[1];
                                this.f15071d = true;
                                c10 = cArr2[0];
                            } else {
                                throw new IllegalStateException(("Unreachable state: " + a10).toString());
                            }
                        } else {
                            c10 = cArr2[0];
                        }
                    } else {
                        c10 = 65535;
                    }
                }
                if (c10 == 65535) {
                    if (i11 == 0) {
                        return -1;
                    }
                    return i11;
                }
                cArr[i6] = c10;
                return i11 + 1;
            }
            CharBuffer wrap = CharBuffer.wrap(cArr, i6, i10);
            if (wrap.position() != 0) {
                wrap = wrap.slice();
            }
            CharBuffer charBuffer = wrap;
            boolean z11 = false;
            while (true) {
                charsetDecoder = this.f15069b;
                ByteBuffer byteBuffer = this.f15070c;
                CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z11);
                if (decode.isUnderflow()) {
                    if (z11 || !charBuffer.hasRemaining()) {
                        break;
                    }
                    byteBuffer.compact();
                    try {
                        int limit = byteBuffer.limit();
                        int position = byteBuffer.position();
                        if (position <= limit) {
                            i12 = limit - position;
                        } else {
                            i12 = 0;
                        }
                        int read = this.f15068a.read(byteBuffer.array(), byteBuffer.arrayOffset() + position, i12);
                        if (read >= 0) {
                            byteBuffer.position(position + read);
                            byteBuffer.flip();
                            read = byteBuffer.remaining();
                        }
                        if (read < 0) {
                            if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                                break;
                            }
                            charsetDecoder.reset();
                            z11 = true;
                        } else {
                            continue;
                        }
                    } finally {
                        byteBuffer.flip();
                    }
                } else {
                    if (decode.isOverflow()) {
                        charBuffer.position();
                        break;
                    }
                    decode.throwException();
                }
            }
            z10 = z11;
            if (z10) {
                charsetDecoder.reset();
            }
            if (charBuffer.position() != 0) {
                i13 = charBuffer.position();
            }
            return i13 + i11;
        }
        StringBuilder p10 = r4.a.p(i6, i10, "Unexpected arguments: ", ", ", ", ");
        p10.append(cArr.length);
        throw new IllegalArgumentException(p10.toString().toString());
    }
}
