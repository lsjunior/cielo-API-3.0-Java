package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class Payment {
	@SerializedName("ServiceTaxAmount")
	private Integer serviceTaxAmount;
	@SerializedName("Installments")
	private Integer installments;
	@SerializedName("Interest")
	private String interest;
	@SerializedName("Capture")
	private boolean capture = false;
	@SerializedName("Authenticate")
	private boolean authenticate = false;
	@SerializedName("Recurrent")
	private boolean recurrent;
	@SerializedName("RecurrentPayment")
	private RecurrentPayment recurrentPayment;
	@SerializedName("CreditCard")
	private CreditCard creditCard;
	@SerializedName("DebitCard")
	private DebitCard debitCard;
	@SerializedName("Tid")
	private String tid;
	@SerializedName("ProofOfSale")
	private String proofOfSale;
	@SerializedName("AuthorizationCode")
	private String authorizationCode;
	@SerializedName("SoftDescriptor")
	private String softDescriptor = "";
	@SerializedName("ReturnUrl")
	private String returnUrl;
	@SerializedName("Provider")
	private Provider provider;
	@SerializedName("PaymentId")
	private String paymentId;
	@SerializedName("Type")
	private Type type;
	@SerializedName("Amount")
	private Integer amount;
	@SerializedName("ReceivedDate")
	private String receivedDate;
	@SerializedName("CapturedAmount")
	private Integer capturedAmount;
	@SerializedName("CapturedDate")
	private String capturedDate;
	@SerializedName("Currency")
	private Currency currency;
	@SerializedName("Country")
	private String country;
	@SerializedName("ReturnCode")
	private String returnCode;
	@SerializedName("ReturnMessage")
	private String returnMessage;
	@SerializedName("Status")
	private Integer status;
	@SerializedName("Links")
	private Object links[];
	@SerializedName("ExtraDataCollection")
	private Object extraDataCollection[];
	@SerializedName("ExpirationDate")
	private String expirationDate;
	@SerializedName("Url")
	private String url;
	@SerializedName("Number")
	private String number;
	@SerializedName("BarCodeNumber")
	private String barCodeNumber;
	@SerializedName("DigitableLine")
	private String digitableLine;
	@SerializedName("Address")
	private String address;
	@SerializedName("BoletoNumber")
	private String boletoNumber;
	@SerializedName("Assignor")
	private String assignor;
	@SerializedName("Demonstrative")
	private String demonstrative;
	@SerializedName("Identification")
	private String identification;
	@SerializedName("Instructions")
	private String instructions;
	@SerializedName("AuthenticationUrl")
	private String authenticationUrl;
	@SerializedName("VoidedAmount")
	private String voidedAmount;
	@SerializedName("VoidedDate")
	private String voidedDate;
	
	// Campos específicos para PIX
	@SerializedName("QrCodeBase64Image")
	private String qrCodeBase64Image;
	@SerializedName("QrCodeString")
	private String qrCodeString;
  @SerializedName("QrCode")
	private QrCode qrCode;
	
	// Campos adicionais para Boleto - Multa
	@SerializedName("NullifyDays")
	private Integer nullifyDays;
	@SerializedName("DaysToFine")
	private Integer daysToFine;
	@SerializedName("FineRate")
	private Integer fineRate;
	@SerializedName("FineAmount")
	private Integer fineAmount;
	
	// Campos adicionais para Boleto - Juros
	@SerializedName("DaysToInterest")
	private Integer daysToInterest;
	@SerializedName("InterestRate")
	private Integer interestRate;
	@SerializedName("InterestAmount")
	private Integer interestAmount;
	

	public Payment(Integer amount, Integer installments) {
		setAmount(amount);
		setInstallments(installments);
	}

	public Payment(Integer amount) {
		this(amount, 1);
	}

	public CreditCard creditCard(String securityCode, String brand) {
		setType(Type.CreditCard);
		setCreditCard(new CreditCard(securityCode, brand));

		return getCreditCard();
	}
	
	public DebitCard debitCard(String securityCode, String brand) {
		setType(Type.DebitCard);
		setDebitCard(new DebitCard(securityCode, brand));

		return getDebitCard();
	}
	

	public RecurrentPayment recurrentPayment(boolean authorizeNow) {
		setRecurrentPayment(new RecurrentPayment(authorizeNow));

		return getRecurrentPayment();
	}

	public Integer getAmount() {
		return amount;
	}

	public Payment setAmount(Integer amount) {
		this.amount = amount;
		return this;
	}

	public boolean getAuthenticate() {
		return authenticate;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public String getAuthenticationUrl() {
		return authenticationUrl;
	}

	public Payment setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
		return this;
	}

	public boolean getCapture() {
		return capture;
	}

	public Integer getCapturedAmount() {
		return capturedAmount;
	}

	public Payment setCapturedAmount(Integer capturedAmount) {
		this.capturedAmount = capturedAmount;
		return this;
	}

	public String getCapturedDate() {
		return capturedDate;
	}

	public Payment setCapturedDate(String capturedDate) {
		this.capturedDate = capturedDate;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public Payment setCountry(String country) {
		this.country = country;
		return this;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public Payment setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
		return this;
	}

	public Payment setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
		return this;
	}
	
	public DebitCard getDebitCard() {
		return debitCard;
	}
	
	public Currency getCurrency() {
		return currency;
	}

	public Payment setCurrency(Currency currency) {
		this.currency = currency;
		return this;
	}

	public Integer getInstallments() {
		return installments;
	}

	public Payment setInstallments(Integer installments) {
		this.installments = installments;
		return this;
	}

	public String getInterest() {
		return interest;
	}

	public Payment setInterest(String interest) {
		this.interest = interest;
		return this;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public Payment setPaymentId(String paymentId) {
		this.paymentId = paymentId;
		return this;
	}

	public String getProofOfSale() {
		return proofOfSale;
	}

	public Payment setProofOfSale(String proofOfSale) {
		this.proofOfSale = proofOfSale;
		return this;
	}

	public Provider getProvider() {
		return provider;
	}

	public Payment setProvider(Provider provider) {
		this.provider = provider;
		return this;
	}

	public String getReceivedDate() {
		return receivedDate;
	}

	public Payment setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
		return this;
	}

	public boolean isRecurrent() {
		return recurrent;
	}

	public Payment setRecurrent(boolean recurrent) {
		this.recurrent = recurrent;
		return this;
	}

	public RecurrentPayment getRecurrentPayment() {
		return recurrentPayment;
	}

	public Payment setRecurrentPayment(RecurrentPayment recurrentPayment) {
		this.recurrentPayment = recurrentPayment;
		return this;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public Payment setReturnCode(String returnCode) {
		this.returnCode = returnCode;
		return this;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public Payment setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
		return this;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public Payment setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
		return this;
	}

	public Integer getServiceTaxAmount() {
		return serviceTaxAmount;
	}

	public Payment setServiceTaxAmount(Integer serviceTaxAmount) {
		this.serviceTaxAmount = serviceTaxAmount;
		return this;
	}

	public String getSoftDescriptor() {
		return softDescriptor;
	}

	public Payment setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public Payment setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public String getTid() {
		return tid;
	}

	public Payment setTid(String tid) {
		this.tid = tid;
		return this;
	}

	public Type getType() {
		return type;
	}

	public Payment setType(Type type) {
		this.type = type;
		return this;
	}

	public String getAddress() {
		return address;
	}
	
	public Payment setAddress(String address) {
		this.address = address;
		return this;
	}

	public boolean isAuthenticate() {
		return authenticate;
	}

	public Payment setAuthenticate(boolean authenticate) {
		this.authenticate = authenticate;
		return this;
	}

	public String getBarCodeNumber() {
		return barCodeNumber;
	}

	public boolean isCapture() {
		return capture;
	}

	public Payment setCapture(boolean capture) {
		this.capture = capture;
		return this;
	}

	public String getBoletoNumber() {
		return boletoNumber;
	}

	public Payment setBoletoNumber(String boletoNumber) {
		this.boletoNumber = boletoNumber;
		return this;
	}

	public String getDemonstrative() {
		return demonstrative;
	}

	public Payment setDemonstrative(String demonstrative) {
		this.demonstrative = demonstrative;
		return this;
	}

	public String getIdentification() {
		return identification;
	}

	public Payment setIdentification(String identification) {
		this.identification = identification;
		return this;
	}

	public String getInstructions() {
		return instructions;
	}

	public Payment setInstructions(String instructions) {
		this.instructions = instructions;
		return this;
	}

	public String getDigitableLine() {
		return digitableLine;
	}

	public String getExpirationDate() {
		return expirationDate;
	}
	
	public Payment setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}
	
	public String getAssignor() {
		return assignor;
	}
	
	public Payment setAssignor(String assignor) {
		this.assignor = assignor;
		return this;
	}

	public Object[] getExtraDataCollection() {
		return extraDataCollection;
	}

	public Object[] getLinks() {
		return links;
	}

	public String getNumber() {
		return number;
	}

	public String getUrl() {
		return url;
	}
	
	public String getVoidedAmount() {
		return voidedAmount;
	}
	
	public String getVoidedDate() {
		return voidedDate;
	}
	
	// Getters para PIX
	public String getQrCodeBase64Image() {
		return qrCodeBase64Image;
	}
  
  public Payment setQrCodeBase64Image(String qrCodeBase64Image) {
    this.qrCodeBase64Image = qrCodeBase64Image;
    return this;
  }
	
	public String getQrCodeString() {
		return qrCodeString;
	}
  
  public Payment setQrCodeString(String qrCodeString) {
    this.qrCodeString = qrCodeString;
    return this;
  }
  
  public QrCode getQrCode() {
    return qrCode;
  }
  
  public Payment setQrCode(QrCode qrCode) {
    this.qrCode = qrCode;
    return this;
  }
	
	// Getters e Setters para Boleto - Multa
	public Integer getNullifyDays() {
		return nullifyDays;
	}
	
	public Payment setNullifyDays(Integer nullifyDays) {
		this.nullifyDays = nullifyDays;
		return this;
	}
	
	public Integer getDaysToFine() {
		return daysToFine;
	}
	
	public Payment setDaysToFine(Integer daysToFine) {
		this.daysToFine = daysToFine;
		return this;
	}
	
	public Integer getFineRate() {
		return fineRate;
	}
	
	public Payment setFineRate(Integer fineRate) {
		this.fineRate = fineRate;
		return this;
	}
	
	public Integer getFineAmount() {
		return fineAmount;
	}
	
	public Payment setFineAmount(Integer fineAmount) {
		this.fineAmount = fineAmount;
		return this;
	}
	
	// Getters e Setters para Boleto - Juros
	public Integer getDaysToInterest() {
		return daysToInterest;
	}
	
	public Payment setDaysToInterest(Integer daysToInterest) {
		this.daysToInterest = daysToInterest;
		return this;
	}
	
	public Integer getInterestRate() {
		return interestRate;
	}
	
	public Payment setInterestRate(Integer interestRate) {
		this.interestRate = interestRate;
		return this;
	}
	
	public Integer getInterestAmount() {
		return interestAmount;
	}
	
	public Payment setInterestAmount(Integer interestAmount) {
		this.interestAmount = interestAmount;
		return this;
	}	

	public enum Provider {
		Bradesco, Bradesco2, BancoDoBrasil, BancoDoBrasil2, BancoDoBrasil3, Simulado, Cielo2, Cielo30
	}

	public enum Type {
		CreditCard, DebitCard, ElectronicTransfer, Boleto, Pix
	}

	public enum Currency {
		BRL, USD, MXN, COP, CLP, ARS, PEN, EUR, PYN, UYU, VEB, VEF, GBP
	}
}