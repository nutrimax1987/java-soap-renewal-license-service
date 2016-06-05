package com.amnetgov.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.amnetgov.data.AbnormalRequest;
import com.amnetgov.data.AspiranteBasicData;
import com.amnetgov.data.AspiranteImagesData;
import com.amnetgov.data.BiometricData;
import com.amnetgov.data.CrcData;
import com.amnetgov.data.CrcHw;
import com.amnetgov.data.CrcLightData;
import com.amnetgov.data.InitialCrcData;
import com.amnetgov.data.LoginData;
import com.amnetgov.data.PinData;
import com.amnetgov.data.PruebasData;
import com.amnetgov.data.SpecialistData;
import com.amnetgov.exception.VvException;

@WebService(targetNamespace = "http://amnetgov.com/", name = "VvamirWS")
public interface VvamirWS {

	/*
	 * GetUserFingerprints - 3.58.3
	 */
	@WebMethod(operationName = "GetLoginSession", action = "http://amnetgov.com/GetLoginSession")
	@RequestWrapper(localName = "GetLoginSession", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.GetLoginSession")
	@ResponseWrapper(localName = "GetLoginSessionResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.GetLoginSessionResponse")
	@WebResult(name = "GetLoginSession", targetNamespace = "http://amnetgov.com/")
	public String getLoginSession(
			@WebParam(name = "LoginData", targetNamespace = "http://amnetgov.com/") LoginData loginData)
					throws VvException;

	@WebMethod(operationName = "IsAlive", action = "http://amnetgov.com/IsAlive")
	@RequestWrapper(localName = "IsAlive", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.IsAlive")
	@ResponseWrapper(localName = "IsAliveResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.IsAliveResponse")
	@WebResult(name = "IsAlive", targetNamespace = "http://amnetgov.com/")
	public boolean isAlive(CrcData crcData, int request) throws VvException;

	/*
	 * InitialProcessSession - 3.42
	 */
	@WebMethod(operationName = "HwRegistration", action = "http://amnetgov.com/HwRegistration")
	@RequestWrapper(localName = "HwRegistrationRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.HwRegistration")
	@ResponseWrapper(localName = "HwRegistrationResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.HwRegistrationResponse")
	@WebResult(name = "HwRegistration", targetNamespace = "http://amnetgov.com/")
	public int hwRegistration(@WebParam(name = "CrcHw", targetNamespace = "http://amnetgov.com/") CrcHw crcHw)
			throws VvException;

	/*
	 * GetUserFingerprints - 3.58.3
	 */
	@WebMethod(operationName = "UserLogin", action = "http://amnetgov.com/UserLogin")
	@RequestWrapper(localName = "UserLoginRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.UserLogin")
	@ResponseWrapper(localName = "UserLoginResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.UserLoginResponse")
	@WebResult(name = "UserLogin", targetNamespace = "http://amnetgov.com/")
	public SpecialistData userLogin(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData loginApp,
			@WebParam(name = "Username", targetNamespace = "http://amnetgov.com/") String username,
			@WebParam(name = "Password", targetNamespace = "http://amnetgov.com/") String password) throws VvException;

	/*
	 * CreateAbnormalConfirmation - 3.58.3
	 */
	@WebMethod(operationName = "CreateAbnormalConfirmation", action = "http://amnetgov.com/CreateAbnormalConfirmation")
	@RequestWrapper(localName = "CreateAbnormalConfirmationRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.CreateAbnormalConfirmation")
	@ResponseWrapper(localName = "CreateAbnormalConfirmationResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.CreateAbnormalConfirmationResponse")
	@WebResult(name = "CreateAbnormalConfirmation", targetNamespace = "http://amnetgov.com/")
	public long createAbnormalConfirmation(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData crcData,
			@WebParam(name = "NumeroIdentificacion", targetNamespace = "http://amnetgov.com/") String numeroIdentificacion,
			@WebParam(name = "TipoIdentificacion", targetNamespace = "http://amnetgov.com/") String tipoIdentificacion,
			@WebParam(name = "SecretaryUsername", targetNamespace = "http://amnetgov.com/") String secretaryUsername,
			@WebParam(name = "Note", targetNamespace = "http://amnetgov.com/") String note,
			@WebParam(name = "Documents", targetNamespace = "http://amnetgov.com/") List<String> documents)
					throws VvException;

	@WebMethod(operationName = "CheckAbnormalConfirmation", action = "http://amnetgov.com/CheckAbnormalConfirmation")
	@RequestWrapper(localName = "CheckAbnormalConfirmationRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.CheckAbnormalConfirmation")
	@ResponseWrapper(localName = "CheckAbnormalConfirmationResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.CheckAbnormalConfirmationResponse")
	@WebResult(name = "CheckAbnormalConfirmation", targetNamespace = "http://amnetgov.com/")
	public AbnormalRequest checkAbnormalConfirmation(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData crcData,
			@WebParam(name = "NumberID", targetNamespace = "http://amnetgov.com/") long numberID) throws VvException;

	/*
	 * GetClinicUserList - 3.58.2 - returns 0-success or 1-fault
	 */
	@WebMethod(operationName = "GetClinicUserList", action = "http://amnetgov.com/GetClinicUserList")
	@RequestWrapper(localName = "GetClinicUserListRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.GetClinicUserList")
	@ResponseWrapper(localName = "GetClinicUserListResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.GetClinicUserListResponse")
	@WebResult(name = "GetClinicUserList", targetNamespace = "http://amnetgov.com/")
	public List<SpecialistData> getClinicUserList(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData crcData) throws VvException;

	/*
	 * UpdateSpecialistaData - 3.58 - returns 0-success or 1-fault
	 */
	@WebMethod(operationName = "UpdateSpecialistaData", action = "http://amnetgov.com/UpdateSpecialistaData")
	@RequestWrapper(localName = "UpdateSpecialistaDataRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.UpdateSpecialistaDataRequest")
	@ResponseWrapper(localName = "UpdateSpecialistaDataResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.UpdateSpecialistaDataResponse")
	@WebResult(name = "UpdateSpecialistaData", targetNamespace = "http://amnetgov.com/")
	public int updateSpecialistaData(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData crcData,
			@WebParam(name = "UserData", targetNamespace = "http://amnetgov.com/") SpecialistData userData,
			@WebParam(name = "ActionType", targetNamespace = "http://amnetgov.com/") int actionType) throws VvException;

	/*
	 * InitialProcessSession - 3.42
	 * 
	 * @WebMethod(operationName = "InitialProcessSession", action =
	 * "http://amnetgov.com/InitialProcessSession")
	 * 
	 * @RequestWrapper(localName = "InitialProcessSession", targetNamespace =
	 * "http://amnetgov.com/", className =
	 * "com.amnetgov.ws.jaxws.InitialProcessSession")
	 * 
	 * @ResponseWrapper(localName = "InitialProcessSessionResponse",
	 * targetNamespace = "http://amnetgov.com/", className =
	 * "com.amnetgov.ws.jaxws.InitialProcessSessionResponse")
	 * 
	 * @WebResult(name = "InitialProcessSession", targetNamespace =
	 * "http://amnetgov.com/") public String initialProcessSession(
	 * 
	 * @WebParam(name = "InitialCrcData", targetNamespace =
	 * "http://amnetgov.com/") InitialCrcData crcData) throws VvException;
	 */

	/*
	 * RequestPaymentPin - 3.41
	 */
	@WebMethod(operationName = "RequestPaymentPin", action = "http://amnetgov.com/RequestPaymentPin")
	@RequestWrapper(localName = "RequestPaymentPinRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.RequestPaymentPinRequest")
	@ResponseWrapper(localName = "RequestPaymentResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.RequestPaymentPinoResponse")
	@WebResult(name = "RequestPaymentResult", targetNamespace = "http://amnetgov.com/")
	public PinData requestPaymentPin(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData crcData,
			@WebParam(name = "NumberID", targetNamespace = "http://amnetgov.com/") String numIdent,
			@WebParam(name = "PaymentValue", targetNamespace = "http://amnetgov.com/") double paymentValue,
			@WebParam(name = "PaymentType", targetNamespace = "http://amnetgov.com/") int paymentType)
					throws VvException;

	/*
	 * SendAspiranteBasicData - 3.30
	 */
	@WebMethod(operationName = "SendAspiranteBasicData", action = "http://amnetgov.com/SendAspiranteBasicData")
	@RequestWrapper(localName = "AspiranteBasicDataRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.AspiranteBasicDataRequest")
	@ResponseWrapper(localName = "AspiranteBasicDataResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.AspiranteBasicDataResponse")
	@WebResult(name = "SendAspiranteBasicDataResult", targetNamespace = "http://amnetgov.com/")
	public String sendAspiranteBasicData(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData crcData,
			@WebParam(name = "AspiranteBasicData") AspiranteBasicData aspiranteBasicData,
			@WebParam(name = "Request") int request) throws VvException;

	/*
	 * SendAspiranteImagesData - SendAspiranteImagesData
	 */

	@WebMethod(operationName = "SendAspiranteImagesData", action = "http://amnetgov.com/SendAspiranteImagesData")
	@RequestWrapper(localName = "AspiranteImagesDataRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.AspiranteImagesDataRequest")
	@ResponseWrapper(localName = "AspiranteImagesDataResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.AspiranteImagesDataResponse")
	@WebResult(name = "AspiranteImagesDataResult", targetNamespace = "http://amnetgov.com/")
	public String sendAspiranteImagesData(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData crcData,
			@WebParam(name = "AspiranteImagesDataRequest") AspiranteImagesData aspiranteImagesData) throws VvException;

	/*
	 * 3.39 and 3.12 SeleccionarImagenes -
	 */
	@WebMethod(operationName = "SeleccionarImagenes", action = "http://amnetgov.com/SeleccionarImagenes")
	@RequestWrapper(localName = "SeleccionarImagenesRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.SeleccionarImagenesRequest")
	@ResponseWrapper(localName = "SeleccionarImagenesoResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.SeleccionarImagenesoResponse")
	@WebResult(name = "SeleccionarImagenesProcesoResult", targetNamespace = "http://amnetgov.com/")
	public BiometricData selectFingersProcess(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcLightData crcData,
			@WebParam(name = "CombinedParam", targetNamespace = "http://amnetgov.com/") String combinedParam,
			@WebParam(name = "Request", targetNamespace = "http://amnetgov.com/") int request) throws VvException;

	/*
	 * 3.36 && 3.32 ReportResultadoFingers
	 */
	@WebMethod(operationName = "ReportResultadoFingers", action = "http://amnetgov.com/ReportResultadoFingers")
	@RequestWrapper(localName = "ReportResultadoFingersRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.ReportResultadoFingersRequest")
	@ResponseWrapper(localName = "ReportResultadoFingersResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.ReportResultdoIdentificationResponse")
	@WebResult(name = "ReportResultadoFingers", targetNamespace = "http://amnetgov.com/")
	public int reportResultdoIdentification(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcLightData crcData,
			@WebParam(name = "IdSeguimiento", targetNamespace = "http://amnetgov.com/") String IdSeguimiento,
			@WebParam(name = "Estado", targetNamespace = "http://amnetgov.com/") int estado,
			@WebParam(name = "ErrorDetails", targetNamespace = "http://amnetgov.com/") int errorDetails,
			@WebParam(name = "Request", targetNamespace = "http://amnetgov.com/") int request) throws VvException;

	/*
	 * SeleccionarResultadosPruebas
	 */
	@WebMethod(operationName = "SeleccionarResultadosPruebas", action = "http://amnetgov.com/SeleccionarResultadosPruebas")
	@RequestWrapper(localName = "SeleccionarResultadosPruebasRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.SeleccionarResultadosPruebasRequest")
	@ResponseWrapper(localName = "SeleccionarResultadosPruebasResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.SeleccionarResultadosPruebasResponse")
	@WebResult(name = "SeleccionarResultadosPruebasResult", targetNamespace = "http://amnetgov.com/")
	public PruebasData seleccionarResultadosPruebas(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") InitialCrcData crcData,
			@WebParam(name = "ProcessId", targetNamespace = "http://amnetgov.com/") long processId) throws VvException;
	
	
	/*
	 * SuperUserLogin - 3.58.3
	 */
	@WebMethod(operationName = "SuperUserLogin", action = "http://amnetgov.com/SuperUserLogin")
	@RequestWrapper(localName = "SuperUserLoginRequest", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.SuperUserLogin")
	@ResponseWrapper(localName = "SuperUserLoginResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.ws.jaxws.SuperUserLoginResponse")
	@WebResult(name = "SuperUserLogin", targetNamespace = "http://amnetgov.com/")
	public SpecialistData superUserLogin(
			@WebParam(name = "CrcData", targetNamespace = "http://amnetgov.com/") CrcData crcData,
			@WebParam(name = "Username", targetNamespace = "http://amnetgov.com/") String username,
			@WebParam(name = "Password", targetNamespace = "http://amnetgov.com/") String password) throws VvException;

}
