package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] listFiles;
        k.e(file, "<this>");
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                for (File file3 : listFiles) {
                    if (file3.isDirectory()) {
                        linkedList.add(file3);
                    } else {
                        j += file3.length();
                    }
                }
            }
        }
        return j;
    }
}
