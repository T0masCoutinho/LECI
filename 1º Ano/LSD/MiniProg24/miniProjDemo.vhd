library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity MiniProg24_Demo is
    port(CLOCK_50 : in  std_logic;
	      SW       : in  std_logic_vector(2 downto 0);
			LEDG		: out std_logic_vector(3 downto 0);
			LEDR     : out std_logic_vector(3 downto 0);
			HEX0		: out std_logic_vector(6 downto 0));
end MiniProg24_Demo;

architecture Structural of MiniProg24_Demo is
	signal bin :  std_logic_vector(3 downto 0);
	signal pulso : std_logic;
	signal pulso2 : std_logic;
	signal lights0 : std_logic_vector(3 downto 0);
	signal lights1 : std_logic_vector(3 downto 0);
	--constant max_valor : positive; -- como o a frequencia do pulse_gen e diferente do programa  para o 3
										   -- isto faz com que nos possamos mudar o valor da frquencia do pulse_gen

begin

	control : entity work.controlador(Behavioral)
				port map(inputs => SW(1 downto 0),
							enable => SW(2),
							outputs => bin);
							
	display : entity work.Bin7SegDecoder(Behavioral)
				port map(binINput => bin,
							decOut_n => HEX0(6 downto 0));
							
	gerador : entity work.pulse_gen(Behavioral)
					generic map(MAX => 25_000_000)
						port map(clk => CLOCK_50,
									enable => bin(0),
									pulse => pulso);
									
	conversor1 : entity work.bin2BCD(Behavioral)
						port map(bin => pulso,
									bin2D => lights0);
	
	conversor2 : entity work.bin2BCD(Behavioral)
						port map(bin => pulso,
									bin2D => lights1);
									
	process
	begin
			if (bin = "00") then
				LEDG(3 downto 0) <= "1111";
				LEDR(3 downto 0) <= "1111";
				
				
			elsif (bin = "01") then
			--	max_valor <= 25_000_000; -- piscar 1 vez por segundo 50MHz/2
				LEDR(3 downto 0) <= lights0(3 downto 0);
				
				
			elsif (bin = "10") then
				--max_valor <= 12_500_000; -- piscar 2 vezes por segundo 50MHz/4
				LEDG(3 downto 0) <= lights(3 downto 0);
				
			end if;
	end process;
end Structural;
				
			
									