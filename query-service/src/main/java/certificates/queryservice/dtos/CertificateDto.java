package certificates.queryservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CertificateDto {
    private String studentName;
    private String issuerName;
    private Double totalHours;
}
