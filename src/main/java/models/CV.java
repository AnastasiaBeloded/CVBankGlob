package models;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CV {

        public String name;
        public String country;
        public String email;
        public String position;
        public String city;
        public String birthday;
        public String phone;


        private String summary;


        private String relocation;


        private String ShortDescription;


       private String title;
       private String description;


        private String startYear;
        private String endYear;
        private String companyName;
        private String companyLocation;
        private String companyUrl;
        private String positionExperience;
        private String aboutCompany;


        private String startYearEducation;
        private String endYearEducation;
        private String instituteName;
        private String location;
        private String educationDescription;


        private String titleOther;
        private String descriptionOther;


        private String link;



}
