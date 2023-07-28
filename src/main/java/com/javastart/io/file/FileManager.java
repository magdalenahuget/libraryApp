package com.javastart.io.file;

import com.javastart.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
