package manager;

import models.CV;
import models.EmployerUser;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {
    @DataProvider
    public static Iterator<Object[]> dataCreateCv() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new BufferedReader(new FileReader("src/test/resources/cv.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{CV.builder()
                    .name(split[0])
                    .country(split[1])
                    .email(split[2])
                    .position(split[3])
                    .city(split[4])
                    .birthday(split[5])
                    .phone(split[6])
                    .summary(split[7])
                    .relocation(split[8])
                    .ShortDescription(split[9])
                    .title(split[10])
                    .description(split[11])
                    .startYear(split[12])
                    .endYear(split[13])
                    .companyName(split[14])
                    .companyLocation(split[15])
                    .companyUrl(split[16])
                    .positionExperience(split[17])
                    .aboutCompany(split[18])
                    .startYearEducation(split[19])
                    .endYearEducation(split[20])
                    .instituteName(split[21])
                    .location(split[22])
                    .educationDescription(split[23])
                    .titleOther(split[24])
                    .descriptionOther(split[25])
                    .link(split[26])
                    .build()
            });
            line = reader.readLine();

        }
        return list.listIterator();
    }
    @DataProvider
    public static Iterator<Object[]> dataCreateCv2() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new BufferedReader(new FileReader("src/test/resources/newCV.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{CV.builder()
                    .name(split[0])
                    .country(split[1])
                    .email(split[2])
                    .position(split[3])
                    .city(split[4])
                    .birthday(split[5])
                    .phone(split[6])
                    .summary(split[7])
                    .relocation(split[8])
                    .ShortDescription(split[9])
                    .title(split[10])
                    .description(split[11])
                    .startYear(split[12])
                    .endYear(split[13])
                    .companyName(split[14])
                    .companyLocation(split[15])
                    .companyUrl(split[16])
                    .positionExperience(split[17])
                    .aboutCompany(split[18])
                    .startYearEducation(split[19])
                    .endYearEducation(split[20])
                    .instituteName(split[21])
                    .location(split[22])
                    .educationDescription(split[23])
                    .titleOther(split[24])
                    .descriptionOther(split[25])
                    .link(split[26])
                    .build()
            });
            line = reader.readLine();

        }
        return list.listIterator();
    }
    @DataProvider
    public static Iterator<Object[]> dataRegistration() throws IOException {
        List<Object[]> list=new ArrayList<>();
        BufferedReader reader = new BufferedReader(new BufferedReader(new FileReader("src/test/resources/registration.csv")));
        String line = reader.readLine();
        while (line!=null){
            String[] split = line.split(",");
            list.add(new Object[]{EmployerUser.builder()
                    .companyName(split[0])
                    .companyWebsite(split[1])
                    .country(split[2])
                    .city(split[3])
                    .street(split[4])
                    .house(split[5])
                    .postcode(split[6])
                    .companyPhone(split[7])
                    .applicantName(split[8])
                    .applicantLastName(split[9])
                    .position(split[10])
                    .phone(split[11])
                    .corporativeEmail(split[12])
                    .password(split[13])
                    .confirmPassword(split[14])
                    .build()});
            line = reader.readLine();
        }

        return list.iterator();
    }
}
