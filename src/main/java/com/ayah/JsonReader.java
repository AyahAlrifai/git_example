package com.ayah;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader implements Reader {

	private String filePath;

	@Override
	public void read() throws IOException {
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader(filePath)) {
			Object obj = jsonParser.parse(reader);

			ArrayList<JSONObject> studentList = (ArrayList<JSONObject>) obj;
			System.out.println("id\tname\t" + "age");
			for (int i = 0; i < studentList.size(); i++) {
				parsestudentObject(studentList.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static void parsestudentObject(JSONObject Student) {
		JSONObject studentObject = (JSONObject) Student.get("Student");

		String id = (String) studentObject.get("id");
		String name = (String) studentObject.get("name");
		String age = (String) studentObject.get("age");
		System.out.println(id + "\t" + name + "\t" + age);
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
