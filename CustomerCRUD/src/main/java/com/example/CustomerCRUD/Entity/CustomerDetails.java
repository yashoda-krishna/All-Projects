package com.example.CustomerCRUD.Entity;



import jakarta.persistence.*;
import lombok.*;

    @Entity
    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public class CustomerDetails {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Embedded
        private BankDetails bankDetails;

        @Embedded
        private PersonalDetails personalDetails;

        // ✅ Inner class for BankDetails
        @Embeddable
        @Getter @Setter
        @NoArgsConstructor @AllArgsConstructor
        public static class BankDetails {
            private String accountNumber;
            private String ifscCode;
            private String bankName;
        }

        // ✅ Inner class for PersonalDetails
        @Embeddable
        @Getter @Setter
        @NoArgsConstructor @AllArgsConstructor
        public static class PersonalDetails {
            private String dob;
            private String gender;
            private String phoneNumber;
            private String email;
        }
    }


