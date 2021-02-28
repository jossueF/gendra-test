package com.gendratest.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.gendratest.models.Settlements;
import com.gendratest.models.ZipCodeData;

@Service
public class FindZipService {

	private BufferedReader getBufferedReader() throws IOException {
		Resource resource  = new ClassPathResource("/assets/CPdescarga.txt");
		InputStream inputStream = resource.getInputStream();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
		
		return buffer;
	}
	
	public List<ZipCodeData> getZipData(String zip) {
		String[] words = null;
		int countLine = 0;
		
		String zipCode, locality, federalEntity, municipality;
		String name, zoneType, settlementType;
		
		List<ZipCodeData> zipList = new ArrayList<>();
		
		try {
			BufferedReader buffer = getBufferedReader();
			String line;
			List<Settlements> settlements = new ArrayList<>();
			
			while((line = buffer.readLine()) != null) {
				countLine++;
				if(countLine > 2) {
					words = line.split("\\|");
					if(words[0].equals(zip)) { 
						zipCode = words[0];
						locality = words[4];
						federalEntity = words[5];
						municipality = words[3];
						
						name = words[1];
						zoneType = words[13];
						settlementType = words[2];
						
						
						settlements.add(new Settlements(name, zoneType, settlementType));
						ZipCodeData zipData = new ZipCodeData(zipCode, locality, federalEntity, settlements, municipality);
						
						zipList.add(zipData);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return zipList;
	}
}
