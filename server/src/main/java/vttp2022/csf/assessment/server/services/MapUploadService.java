package vttp2022.csf.assessment.server.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import vttp2022.csf.assessment.server.repositories.MapCache;

@Service
public class MapUploadService {
 
    @Autowired
    private MapCache mapCache;

    public void getMap(MultipartFile file, String lat, String lng) 
            throws SQLException, IOException  {
        mapCache.getMap(file, lat, lng );
    }

   
    
    
}


