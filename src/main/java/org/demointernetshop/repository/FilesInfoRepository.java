package org.demointernetshop.repository;

import org.demointernetshop.model.fileStorage.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesInfoRepository extends JpaRepository <FileInfo, Long> {
}
