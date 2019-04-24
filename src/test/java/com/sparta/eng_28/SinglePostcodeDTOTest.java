package com.sparta.eng_28;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class SinglePostcodeDTOTest {

    private static PostcodeJsonParser postcodeJsonParser;
    private static SinglePostcodeDTO singlePostcodeDTO;

    @BeforeClass
    public static void chooseTestFile()
    {
        postcodeJsonParser = new PostcodeJsonParser("resources/singlepostcode.json");
        singlePostcodeDTO = new SinglePostcodeDTO(postcodeJsonParser.getPostcodeJson());
    }

    @Test
    public void getPostcodeTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getPostcode(),"BN1 7JD");
    }

    @Test
    public void getQualityTest()
    {
        Assert.assertTrue(singlePostcodeDTO.getQuality() == 1);
    }

    @Test
    public void getEastingsTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getEastings(),531520);
    }

    @Test
    public void getNorthingsTest()
    {
        long northings = (long) singlePostcodeDTO.getNorthings();
        Assert.assertEquals(northings,106547);
    }

    @Test
    public void getCountryTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getCountry(),"England");
    }
    @Test
    public void getNhsHaTest(){
        Assert.assertEquals(singlePostcodeDTO.getNhsHa(),"South East Coast");
    }
    @Test
    public void getLongitudeTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getLongitude(),-0.133318,0.0);
    }
    @Test
    public void getLatitudeTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getLatitude(),50.843508,0.000000);
    }
    @Test
    public void getEuropeanElectoralRegionTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getEuropeanElectoralRegion(),"South East");
    }
    @Test
    public void getPrimaryCareTrustTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getPrimaryCareTrust(),"Brighton and Hove City");
    }
    @Test
    public void getRegionTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getRegion(),"South East");
    }
    @Test
    public void getLsoaTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getLsoa(),"Brighton and Hove 010B");
    }
    @Test
    public void getMsoaTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getMsoa(),"Brighton and Hove 010");
    }

    @Test
    public void getIncodeTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getIncode(),"7JD");
    }

    @Test
    public void getOutcodeTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getOutcode(),"BN1");
    }

    @Test
    public void getParliamentaryConstituencyTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getParliamentaryConstituency(),"Brighton, Pavilion");
    }

    @Test
    public void getAdminDistrictTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getAdminDistrict(),"Brighton and Hove");
    }

    @Test
    public void getParishTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getParish(),"Brighton and Hove, unparished area");
    }

    @Test
    public void getAdminCountyTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getAdminCounty(),null);
    }

    @Test
    public void getAdminWardTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getAdminWard(),"Hollingdean and Stanmer");
    }
    @Test
    public void getCedTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getCed(),null);
    }

    @Test
    public void getCcgTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getCcg(),"NHS Brighton and Hove");
    }

    @Test
    public void getNutsTest()
    {
        Assert.assertEquals(singlePostcodeDTO.getNuts(),"Brighton and Hove");
    }


}
