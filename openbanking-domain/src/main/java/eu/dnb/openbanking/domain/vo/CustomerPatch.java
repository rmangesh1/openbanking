package eu.dnb.openbanking.domain.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

/**
 * Created by rmang on 11-03-2018.
 */
public class CustomerPatch {

    @Email
    private String email;

    @Pattern(regexp = "^\\+?[1-9]\\d{1,14}$")
    private String phone;

    public CustomerPatch() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerPatch{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
