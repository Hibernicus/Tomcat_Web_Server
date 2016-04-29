<?xml version="1.0"?>

 <xsl:stylesheet version="1.0"
 xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 


 <xsl:template match="/">
 <html>
 <style> H5 {color:#335533} 
  body {color:#666633}</style>
  <body style="font-family:Arial;font-size:12pt;background-color:#FFFFCC">

    <xsl:for-each select="Resources/Resource">
      <div style="background-color:#CCFF99; color:#FF6600;padding:4px">
        <span style="font-weight:bold"><xsl:value-of select="resource_name"/></span>
        -  <xsl:element name="a">
  		<xsl:attribute name="href">
    		<xsl:value-of select="name"/>
  		</xsl:attribute>
  		 click to open resource
	</xsl:element>
      </div>
      <div style="margin-left:20px;margin-bottom:1em;font-size:10pt">
	<table border="1">
	<tr>
	<td width ="600">
	<H5>Subject(s): </H5>
	<xsl:for-each select="subjects/sub">
		<span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>

	
	<H5>Level(s): </H5>
	<xsl:for-each select="maths_levels/mLevel">
		<span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			M <xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>

	<br/>
	<xsl:for-each select="english_levels/eLevel">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			E <xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>

	<br/>
	<xsl:for-each select="ict_levels/iLevel">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			I <xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>

	<br/>	 
	<H5>Description: </H5>
		<span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
        		<xsl:value-of select="description"/>
		</span>
	

	<H5>Core Curriculum: </H5>
	<xsl:for-each select="core_codes/cc">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			 <xsl:value-of select="current()"/>;
		</span>
		<br/>
	</xsl:for-each>
	

	<H5>Functional Skills: </H5>
	<xsl:for-each select="fs_codes/fs">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			 <xsl:value-of select="current()"/>
		</span>
		<br/>
	</xsl:for-each>
	</td>
	<td width ="300">

	<H5>Maths Topics: </H5>
	<xsl:for-each select="maths_topics/m_topic">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	
		 
	
	<H5>English Topics: </H5>
	<xsl:for-each select="english_topics/e_topic">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	
	
	<H5>ICT Topics: </H5>
	<xsl:for-each select="ict_topics/i_topic">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	
	
	<H5>Popular Maths Tags: </H5>
	<xsl:for-each select="maths_tags/m_tag">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	
	 
		
	
	<H5>Popular English Tags: </H5>
	<xsl:for-each select="english_tags/e_tag">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	

	<H5>Popular ICT Tags: </H5>
	<xsl:for-each select="ict_tags/i_tag">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	
	</td>
	<td width ="300">

	<H5>User Defined: </H5>
	<xsl:for-each select="user_tags/u_tag">
		 <span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	
	 
		
	<H5>SEAL: </H5>
	<xsl:for-each select="seal/seal_tag">
		<span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	
	
	
	<H5>SMSC: </H5>
	<xsl:for-each select="smsc/smsc_tag">
		<span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>

	

	<H5>ECM: </H5>
	<xsl:for-each select="ecm/ecm_tag">
		<span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	

	<H5>REGARDS: </H5>
	<xsl:for-each select="regards/regards_tag">
		<span style = "margin-left:30px;margin-bottom:1em;font-size:10pt">
			<xsl:value-of select="current()"/>;
		</span>
		
	</xsl:for-each>
	
	

	<b>Added by: </b>
        <span style="font-style:italic">
	
          <xsl:value-of select="added_by"/> 
        </span>
	<br/>
	<b>Date: </b>
        <span style="font-style:italic">
          <xsl:value-of select="date_added"/> 
        </span>
	</td>
	</tr>
	</table>
      </div>
    </xsl:for-each>
  </body>
</html>

 </xsl:template>

 </xsl:stylesheet> 
