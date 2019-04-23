package com.sparta.eng_28;

import org.json.simple.JSONObject;

import java.util.Map;

public class SinglePostcodeDTO
{
    private Map<String, Object> primaryMap;
    private Map<String, String> codes;

    public SinglePostcodeDTO(JSONObject pcJson)
    {
        primaryMap = (Map<String, Object>) pcJson.get("result");
        codes = (Map<String, String>) primaryMap.get("codes");
    }

    public Map<String, String> getCodes()
    {
        return codes;
    }

    public String getPostcode()
    {
        return (String) primaryMap.get("postcode");
    }

    public int getQuality()
    {
        return (int) primaryMap.get("quality");
    }

    public int getEastings(){
        return (int) primaryMap.get("eastings");
    }

    public int getNorthings()
    {
        return (int) primaryMap.get("northings");
    }

    public String getCountry()
    {
        return (String) primaryMap.get("country");
    }


    public String getNhsHa()
    {
        return (String) primaryMap.get("nhs_ha");
    }

    public float getLongitude()
    {
        return (float) primaryMap.get("longitude");
    }

    public float getLatitude()
    {
        return (float) primaryMap.get("latitude");
    }

    public String getEuropeanElectoralRegion()
    {
        return (String) primaryMap.get("european_electoral_region");
    }

    public String getPrimaryCareTrust()
    {
        return (String) primaryMap.get("primary_care_trust");
    }

    public String getRegion()
    {
        return (String) primaryMap.get("region");
    }

    public String getLsoa()
    {
        return (String) primaryMap.get("lsoa");
    }

    public String getMsoa()
    {
        return (String) primaryMap.get("msoa");
    }

    public String getIncode()
    {
        return (String) primaryMap.get("incode");
    }

    public String getOutcode()
    {
        return (String) primaryMap.get("outcode");
    }

    public String getParliamentaryConstituency()
    {
        return (String) primaryMap.get("parliamentary_constituency");
    }

    public String getAdminDistrict()
    {
        return (String) primaryMap.get("admin_district");
    }

    public String getParish()
    {
        return (String) primaryMap.get("parish");
    }

    public String getAdminCounty()
    {
        return (String) primaryMap.get("admin_county");
    }

    public String getAdminWard()
    {
        return (String) primaryMap.get("admin_ward");
    }

    public String getCed()
    {
        return (String) primaryMap.get("ced");
    }

    public String getCcg()
    {
        return (String) primaryMap.get("ccg");
    }

    public String getNuts()
    {
        return (String) primaryMap.get("nuts");
    }


}
